package Work;

import java.util.Scanner;

public class Task_K{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int x1 = input.nextInt();
        int y1 = input.nextInt();
        int x2 = input.nextInt();
        int y2 = input.nextInt();

        if( Math.abs(x1-x2) == 1 && Math.abs(y1-y2)==2 ){
            System.out.println("YES");
        }else if(Math.abs(x1-x2) == 2 && Math.abs(y1-y2)==1){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
