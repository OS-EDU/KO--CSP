import java.util.Scanner;

public class Main {

    // 定义一个静态 pinyin 数组
    static String[] pinyin={"ling","yi","er","san","si","wu","liu","qi","ba","jiu"};

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.next();
        int sum = 0;
        int size = 0;
        // output 数组用来存放拆分后的 sum
        int[] output = new int[99];
        // 用循环遍历求出输入数 n 的各位数之和
        for (int i = 0; i < n.length(); i++) {
            sum += Integer.parseInt(n.charAt(i) + "");
        }
        if(sum == 0) {
            System.out.println("ling");
        }else {
            // 循环把 sum 拆分存入数组
            while (sum != 0) {
                output[size] = sum % 10;
                sum /= 10;
                size ++;
            }
        }
        // 倒序输出拼音
        for (int i = size-1; i >= 0; i--) {
            System.out.print(pinyin[output[i]]);
            if(i != 0) System.out.print(" ");
        }
    }
}
