package Work;
import java.util.*;
public class r
{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int n = (int)(Math.random() * 10);

        int ans = input.nextInt();

        while( n != ans){
            if(n > ans){
                System.out.println("Low");
            }else{
                System.out.println("High");
            }
            ans = input.nextInt();
        }

        System.out.println("Ok");
    }
}