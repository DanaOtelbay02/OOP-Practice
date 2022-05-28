package Work.Loop;
import java.util.*;
public class Task_I {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int c = 0;
        for(int i = 1; i <= a ; i++){
            if(a % i == 0){
                c = c + 1;
            }
        }
        System.out.print(c);
    }
}
