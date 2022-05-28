package Week13;

import java.io.*;
import java.util.*;

public class Task20_11 {
    public static void main(String[] args) throws Exception {
        File file = new File("C:\\Users\\user\\Desktop\\KBTU\\4\\OOP\\OOP\\src\\Week13\\Task20_11.txt");
        Scanner input = new Scanner(new FileReader(file));

        String st = "";

        while (input.hasNext()) {
            st += input.next();
        }

        char[] list = new char[st.length()];

        for(int i=0; i < list.length; i++){
            list[i] = st.charAt(i);
        }

        Stack<Character> symbols = new Stack<Character>();

        for(int i = 0; i < list.length; i++){
            char temp = list[i];
            if(temp == '(' || temp == '{' || temp == '['){
                symbols.push(temp);
            }else if(temp == ')' || temp == '}' || temp == ']'){
                if (temp == ')' && symbols.peek().equals('(')){
                    symbols.pop();
                } else if (temp == '}' && symbols.peek().equals('{')) {
                    symbols.pop();
                } else if (temp == ']' && symbols.peek().equals('[')) {
                    symbols.pop();
                }else{
                    System.out.println("There is a mistake at index: " + i);
                    break;
                }
            }else{
                System.out.println("There is a mistake at index: " + i);
                break;
            }
        }

        if(symbols.empty()){
            System.out.println("It is okay");
        }else{
            System.out.println("Sorry");
        }
    }
}
