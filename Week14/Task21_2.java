package Week14;

import java.io.*;
import java.util.*;

public class Task21_2 {
    public static void main(String[] args) throws Exception {
        File file = new File("C:\\Users\\user\\Desktop\\KBTU\\4\\OOP\\OOP\\src\\Week14\\Task21_2.txt");
        Scanner input = new Scanner(new FileReader(file));
//        String str = "";

        HashSet<String> words = new HashSet<>();

        while(input.hasNext()){
//            str += input.next();
            words.add(input.next());
        }

//        System.out.println(str);
//        char a;
//        String word = "";
//        for(int i = 0; i < str.length(); i++){
//            a = str.charAt(i);
////            System.out.println(a);
//            if(a != ' '){
//                word += a;
//            }else{
//                words.add(word);
//                word = "";
//            }
//        }

        List<String> list = new ArrayList<String>(words);

        Collections.sort(list);

        System.out.println(list);
    }
}
