import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 输入 1 个正整数 N 和一个符号
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        String s = in.next();
        // 定义 k 为每一行的符号数，r 为总符号数
        int k = 1, r = 1;
        for (int i = 3; r + 2 * i <= N; i += 2) {
            r = r + 2 * i;
            k = i;
        }
        // 遍历打印倒三角
        for (int i = k, cnt = 0; i >= 1; i -= 2, cnt ++) {
            // k 经上个 for() ,为最后一行的符号数，遍历输出成倒三角
            for(int j = 0; j < cnt; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j < i; j++) {
                System.out.print(s);
            }
            System.out.println();
        }
        // 遍历打印正三角
        for(int i = 3, cnt = (k - 1) / 2 - 1; i <= k; i+=2, cnt--){
            // 正三角从第一行 3 个开始打印
            for(int j = 0; j < cnt; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j < i; j++) {
                System.out.print(s);
            }
            System.out.println();
        }
        // 输出剩余的符号个数
        System.out.printf("%d", N - r);
    }
}