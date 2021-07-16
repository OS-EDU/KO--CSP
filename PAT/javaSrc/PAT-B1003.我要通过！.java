import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (n-- > 0) {
            String s = in.next();
            char[] str = s.toCharArray();
            int a = 0, b = 0, c = 0;
            int j = 0;
            boolean flag = false;
            // a的长度
            while (str[j++] != 'P') {
                if (j == str.length || (str[j-1] != ' ' && str[j-1] != 'A')) {
                    flag = true;
                    break;
                }
                a++;
            }
            if (flag) {
                System.out.println("NO");
                continue;
            }
            // b的长度
            while (str[j++] != 'T') {
                if (j == str.length || (str[j-1] != ' ' && str[j-1] != 'A')) {
                    flag = false;
                    break;
                }
                b++;
            }
            if (flag) {
                System.out.println("NO");
                continue;
            }
            // c的长度
            c = str.length-j;
            // 输出
            if (b == 0) {
                System.out.println("NO");
            } else if (a * b == c) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
