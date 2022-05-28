package Work.Loop;

import java.util.Scanner;

public class Task_K {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int l;
        int sum = 0;


        for(int i = 1; i <= n; i++){
            l = input.nextInt();

            sum += l;
        }

        System.out.print(sum);


    }
}

