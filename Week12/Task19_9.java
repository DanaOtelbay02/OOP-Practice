package Week12;

import java.util.ArrayList;

//import static java.lang.Math.random;

public class Task19_9 {
    public static void main(String[] args){
//        ArrayList<Integer> myList = new ArrayList<>();
        ArrayList<Character> myList = new ArrayList<>();
//        for(int i = 0; i < 10; i++){
//            myList.add((int)(Math.random() * 10));
//            myList.add(i);
//        }
        myList.add('A');
        myList.add('B');
        myList.add('A');
        myList.add('B');
        myList.add('D');
        myList.add('F');
        myList.add('C');

        sort(myList);

        for(Character element : myList){
            System.out.println(element);
        }
    }


    public static <E extends Comparable<E>> void sort(ArrayList<E> list) {
        for (int i = 0; i < list.size(); i++) {
            E currentMin = list.get(i);
            int currentMinIndex = i;

            for (int j = i + 1; j < list.size(); j++) {
                if (currentMin.compareTo(list.get(j)) > 0 ) {
                    currentMin = list.get(j);
                    currentMinIndex = j;
                }
            }

            if (currentMinIndex != i) {
                list.set(currentMinIndex, list.get(i));
                list.set(i, currentMin);
            }
        }
    }
}
