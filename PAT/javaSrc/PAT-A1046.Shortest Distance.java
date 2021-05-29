import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException { // 抛出 IO 异常
        // 定义一个缓冲输入流
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] first = reader.readLine().split(" ");
        // 定义路口数、数组和总距离
        int n = Integer.parseInt(first[0]);
        int[] dis = new int[n + 1];
        int[] arr = new int[n + 1];
        int sum = 0;
        // 遍历输入距离并存入数组
        for (int i = 1; i <= n; i++) {
            dis[i] = Integer.parseInt(first[i]);
            sum += dis[i];
            arr[i] = sum;
        }
        // 计算给定的 m 对出口之间的最短距离
        int m = Integer.parseInt(reader.readLine());
        for (int i = 0; i < m; i++) {
            String[] line = reader.readLine().split(" ");
            int l = Integer.parseInt(line[0]);
            int r = Integer.parseInt(line[1]);
            // 把路口顺序转换为正序
            if (l > r) {
                int temp = l;
                l = r;
                r = temp;
            }
            // 计算出最短距离并输出
            int pre1 = arr[r - 1] - arr[l - 1];
            int pre2 = sum - pre1;
            System.out.println(Math.min(pre1,pre2));
        }
    }
}
