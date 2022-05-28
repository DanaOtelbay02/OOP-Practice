package Work.Loop;
import java.util.Scanner;
public class Task_G {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i = 1;
        for (; i <= a; i++) {
            if (a % i == 0) {
                System.out.println(i + " ");
            }
        }
    }
}
