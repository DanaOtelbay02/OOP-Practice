package Week13;

import java.util.Iterator;
import java.util.LinkedList;
import java.time.*;

public class Task20_6 {
    public static void main(String[] args){
        long a;

        LinkedList<Long> numbers = new LinkedList<>();
        for(long i = 1; i <= 100000; i++){
            numbers.add(i);
        }

        Iterator<Long> iterator = numbers.iterator();
        long start_i = System.currentTimeMillis();
        while(iterator.hasNext()){
            a = iterator.next();
        }
        long finish_i = System.currentTimeMillis();

        System.out.println(finish_i - start_i);

        long start_g = System.currentTimeMillis();
        for(int i = 0; i < numbers.size(); i++){
            a = numbers.get(i);
            if(i == 0) System.out.println(numbers.get(i));
        }
        long finish_g = System.currentTimeMillis();

        System.out.println(finish_g - start_g);


    }
}
