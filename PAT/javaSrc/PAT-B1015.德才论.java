import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum;
        int n = in.nextInt();
        int l = in.nextInt();
        int h = in.nextInt();
        String num;
        int de;
        int cai;
        List<Student> list1 = new ArrayList();
        List<Student> list2 = new ArrayList();
        List<Student> list3 = new ArrayList();
        List<Student> list4 = new ArrayList();
        for (int i = 0; i < n; i++) {
            num = in.next();
            de = in.nextInt();
            cai = in.nextInt();
            // new 一个 Student 对象
            Student stu = new Student(num, de, cai);
            // 分出输入数的层级
            if (de >= h && cai >= h) {
                list1.add(stu);
            }
            if (de >=h && cai <h && cai >= l) {
                list2.add(stu);
            }
            if (de <h && de >= l && cai < h && cai >= l && de >= cai) {
                list3.add(stu);
            }
            if (de < h && de >= l && cai >= l && de < cai) {
                list4.add(stu);
            }
        }
        // 给每个分层排序
        Collections.sort(list1);
        Collections.sort(list2);
        Collections.sort(list3);
        Collections.sort(list4);
        // 输出
        System.out.println(list1.size() + list2.size() + list3.size() + list4.size());
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i).num + " " + list1.get(i).de + " " + list1.get(i).cai);
        }
        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i).num + " " + list2.get(i).de + " " + list2.get(i).cai);
        }
        for (int i = 0;i < list3.size(); i++) {
            System.out.println(list3.get(i).num + " " + list3.get(i).de + " " + list3.get(i).cai);
        }
        for (int i = 0; i < list4.size(); i++) {
            System.out.println(list4.get(i).num + " " + list4.get(i).de + " " + list4.get(i).cai);
        }

    }

}
// 构造 Student 类引用 Comparable 接口
class Student implements Comparable<Student> {
    String num;
    int de;
    int cai;
    public Student(String sto, int de, int cai) {
        super();
        this.num = sto;
        this.de = de;
        this.cai = cai;
    }
    @Override
    public int compareTo(Student s) {
        int result = 0;
        result = - (de + cai - s.de - s.cai); // 总分降序
        if (result == 0) {
            result = - (de - s.de); // 德分降序
            if (result == 0) {
                result = num.compareTo(s.num); // 学号升序
            }
        }
        return result;
    }

}
