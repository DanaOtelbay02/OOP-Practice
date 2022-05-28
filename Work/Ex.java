package Work;

import java.util.Scanner;

public class Ex {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = 6;
        int count = 0;
        for( int i =1 ; i<=n; i++){
            if(n%i ==0){
                count++;
            }
        }

        System.out.print(count);
    }
}
