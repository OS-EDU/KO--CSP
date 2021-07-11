import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] week = { "MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN" };
        String str1 = in.nextLine();
        String str2 = in.nextLine();
        String str3 = in.nextLine();
        String str4 = in.nextLine();
        boolean isFindWeek = false;
        boolean isFindHour = false;
        for (int i = 0; i < str1.length() && i < str2.length(); i++) {
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);
            if (ch1 == ch2) {
                if (!isFindWeek && ch1 >= 'A' && ch1 <= 'G') {
                    System.out.print(week[ch1 - 65] + " ");
                    isFindWeek = true;
                    continue;
                }
                if (isFindWeek && !isFindHour) {
                    if (ch1 >= '0' && ch1 <= '9') {
                        System.out.printf("%02d:", (ch1 - 48));
                        isFindHour = true;
                    }else if (ch1 >= 'A' && ch1 <= 'N') {
                        System.out.print((ch1 - 55) + ":");
                        isFindHour = true;
                    }
                }
            }
        }
        for (int i = 0; i < str3.length() && i < str4.length(); i++) {
            char ch3 = str3.charAt(i);
            char ch4 = str4.charAt(i);
            if (ch3 == ch4) {
                if (ch3 >= 'A' && ch3 <= 'Z' || ch3 >= 'a' && ch3 <= 'z') {
                    System.out.printf("%02d", i);
                }
            }
        }
    }
}
