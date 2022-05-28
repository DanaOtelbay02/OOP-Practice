package Week13;

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Task20_1 {
    public static void main(String[] args) throws Exception {
        File file = new File("C:\\Users\\user\\Desktop\\KBTU\\4\\OOP\\OOP\\src\\Week13\\Task20_1.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;

        LinkedList<Character> list = new LinkedList<>();

        while ((st = br.readLine()) != null){
            st = st.replaceAll("\\s+","");
            for(int i=0; i<st.length(); i++){
                list.add(st.charAt(i));
            }
        }
        Collections.sort(list);

        for(Character e: list){
            System.out.println(e);
        }
    }
}
