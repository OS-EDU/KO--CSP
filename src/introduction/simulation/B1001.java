package introduction.simulation;

import java.util.Scanner;

/**
 * B1001.害死人不偿命的(3 * n + 1)猜想
 * 题目描述：
 * 卡拉兹猜想：对于任何一个自然数n，如果它是偶数，那么把它一半砍掉；如果它是奇数，那么把(3 * n + 1)砍掉一半。
 * 这样一直反复砍下去，最后一定在某一步得到 n = 1。卡拉兹在1950年的世界数学家大会上公布了这个猜想，据说当时耶鲁大
 * 学师生齐动员，拼命想证明这个貌似很荒唐的命题，结果闹得学生们无心学业，一心只证(3 * n + 1)，以至于有人说这是一个
 * 阴谋，卡拉兹是在蓄意延缓美国数学界与科研界的进展……
 * 此处并非要证明卡拉兹猜想，而是给定的任一不超过1000的正整数n，简单地数一下，需要多少步才能得到 n = 1？
 * <p>
 * 输入格式：
 * 每个测试输入包含1个测试用例，即给出自然数n的值。
 * 输出格式：
 * 输出从n计算到1需要的步数。
 * 输入样例：
 * 3
 * 输出样例：
 * 5
 */

public class B1001 {
    public static void main(String[] args) {
        int step = 0;// 步长
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = (3 * n + 1) / 2;
            }
            step++;
        }
        System.out.println("step = " + step);
    }
}
