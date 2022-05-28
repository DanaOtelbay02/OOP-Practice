package Week12;

import java.util.*;

public class Task19_5 {
    public static void main(String[] args){
        Integer[] myList = new Integer[10];

        for(int i = 0; i < myList.length; i++){
            myList[i] = i;
        }

        System.out.println("Max element is " + max(myList));
    }

    public static <E extends Comparable<E>> E max(E[] list){
        E max = list[0];
        for(int i = 0; i < list.length; i++){
            E element = list[i];
            if(element.compareTo(max) > 0){
                max = element;
            }
        }
        return max;
    }
}
