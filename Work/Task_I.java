package Work;


import java.util.Scanner;

public class Task_I{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int x1 = input.nextInt();
        int y1 = input.nextInt();
        int x2 = input.nextInt();
        int y2 = input.nextInt();

        if( Math.abs(x1-x2) == Math.abs(y1-y2) || x1 == x2 || y1 == y2){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }

}
