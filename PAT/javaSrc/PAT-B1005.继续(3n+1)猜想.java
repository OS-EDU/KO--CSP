import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int K = in.nextInt();
        int[] test = new int[K];
        int[] A = new int[101];
        int[] B = new int[101];
        for (int i = 0; i < K; i++) {
            int n = in.nextInt();
            test[i] = n;
            while (n != 1) {
                if (n % 2 == 0) {
                    n /= 2;
                } else {
                    n = (3 * n + 1) / 2;
                }
                if (n <= 100) {
                    A[n] ++;
                }
            }
        }
        int size = 0;
        for (int i = 0; i < K; i++) {
            if (A[test[i]] == 0) {
                B[size ++] = test[i];
            }
        }
        for (int i = 0; i < size; i++){
            for (int j = 0; j < (size - 1) - i;j ++) {
                if (B[j] < B[j + 1]) {
                    int temp = B[j];
                    B[j] = B[j + 1];
                    B[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < size; i++) {
            System.out.print(B[i]);
            if (i != size - 1) {
                System.out.print(" ");
            }
        }
    }
}
