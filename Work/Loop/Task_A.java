package Work.Loop;

import java.util.Scanner;
public class Task_A {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();

        do{
            if(a%2 == 0){
                System.out.print(a + " ");
            }
            a++;
        }while(a<=b);

        for(;a<=b; a++){
            if(a%2 ==0){
                System.out.print(a + " ");
            }
        }
    }
}
