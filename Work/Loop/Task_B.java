package Work.Loop;

import java.util.Scanner;
public class Task_B {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();

//        while(a <= b){
//            if(a%d == c){
//                System.out.print(a + " ");
//            }
//            a++;
//        }

        for(int i = a; i <= b; i++){
            if(i%d == c){
                System.out.print(i + " ");
            }
        }

//        do{
//            if(a%d == c){
//                System.out.print(a + " ");
//            }
//            a++;
//        }while(a <= b);

    }
}