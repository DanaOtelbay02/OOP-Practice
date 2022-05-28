package Work.Loop;
import java.util.*;
public class Task_cc {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int digit, max = -111111, min = 1111111;

        while(n > 0){
            digit = n % 10;

            if(min > digit){
                min = digit;
            }
            if(max < digit){
                max = digit;
            }

            n /= 10;
        }

        System.out.print(min + " " + max);
    }
}
