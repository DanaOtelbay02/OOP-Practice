package Work;

import java.util.Scanner;

public class Task_T {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if(a+b > c && a+c > b && b+c>a) {
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }
}
