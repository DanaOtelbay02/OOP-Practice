package Work;
import java.util.Scanner;
public class Task_R {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int k = input.nextInt();
        int m = input.nextInt();
        int n = input.nextInt();

        int ans;

        if(n <= k){
            ans = m * 2;
        }else if(n*2 % k == 0){
            ans = m * ((n*2)/k);
        }else{
            ans = m * (1+((n*2)/k));
        }
        System.out.println(ans);
    }
}
