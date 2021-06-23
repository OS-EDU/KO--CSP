import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int size = 0;
        // 定义一个数组存储各位数
        int[] out = new int[3];
        // 遍历拆分 n 吗，并存入数组
        while (n != 0) {
            out[size] = n % 10;
            n /= 10;
            size ++;
        }
        // 如果 n 为三位数，输出
        if (size > 2) {
            for (int i = 0; i < out[size - 1]; i++) {
                System.out.print("B");
            }
        }
        // n 为两位数，输出
        for (int j = 0; j < out[1]; j++) {
            System.out.print("S");
        }
        for (int k = 1; k <= out[0]; k++) {
            System.out.print(k);
        }
    }
}
