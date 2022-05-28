package Week12;

import java.util.*;

public class Task19_3 {
    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<>();
        for(int i=0; i<10; i++){
            String name = "name" + i;
            names.add(name);
            names.add(name);
        }
        for(String name: names){
            System.out.print(name + " ");
        }
        System.out.println();

        names = removeDuplicates(names);

        for(String name: names){
            System.out.print(name + " ");
        }
    }

    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list){
        ArrayList<E> newList = new ArrayList<>(list.size());

        for(E element : list){
            if(!newList.contains(element)){
                newList.add(element);
            }
        }

        return newList;
    }
}
