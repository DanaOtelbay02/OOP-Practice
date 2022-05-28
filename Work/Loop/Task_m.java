package Work.Loop;

import java.util.*;
public class Task_m {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int minus = 0;
        int plus = 0;
        int l;
        for (int i = 1; i <= n; i++) {
            l = sc.nextInt();
            if (l == 0) {
                sum += 1;
            }
            if (l < 0) {
                minus += 1;
            }
            if (l > 0) {
                plus += 1;
            }

        }
        System.out.println(sum + " " + plus + " "+minus);
    }
}
