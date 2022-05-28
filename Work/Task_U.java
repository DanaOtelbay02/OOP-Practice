package Work;

import java.util.Scanner;

public class Task_U {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if((a == b && a != c) || (a == c && a != b) || (c == b && b != a)) {
            System.out.println(2);
        }else if ( a==b && a==c){
            System.out.println(3);
        }else{
            System.out.println(0);
        }

    }
}