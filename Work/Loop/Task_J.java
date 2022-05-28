package Work.Loop;

import java.util.Scanner;

public class Task_J {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int sum = 0;
        int n;

        for(int i = 1; i <=100; i++){
            n = input.nextInt();
            sum += n;
        }

        System.out.print(sum);

    }
}
