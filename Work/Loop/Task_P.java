package Work.Loop;
import java.util.*;
public class Task_P{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int digit;
        int sum = 0;

        while(a > 0){
            digit = a % 10;
            sum += digit;
            a /= 10;
        }

        System.out.print(sum);
    }
}
