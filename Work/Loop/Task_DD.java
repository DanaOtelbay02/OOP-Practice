package Work.Loop;
import java.util.*;
public class Task_DD {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int num = 0 ,  a =0, countFlip = 0;

        for(int count = 1; count <= n; count++){
            num = count;
            int flip = 0;
            while(num>0){
                a = num % 10;
                num/=10;
                flip = flip * 10 + a;
            }
            if(count == flip){
                countFlip += 1;
            }
        }
        System.out.print(countFlip);
    }
}
