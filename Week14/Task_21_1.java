package Week14;

import java.util.LinkedHashSet;

public class Task_21_1 {
    public static void main(String[] args){
        LinkedHashSet<String> s1 = new LinkedHashSet<>();
        LinkedHashSet<String> s2 = new LinkedHashSet<>();
        s1.add("George");
        s1.add("Jim");
        s1.add("John");
        s1.add("Blake");
        s1.add("Kevin");
        s1.add("Michael");

        s2.add("George");
        s2.add("Katie");
        s2.add("Kevin");
        s2.add("Michelle");
        s2.add("Ryan");

        LinkedHashSet<String> sc1 = (LinkedHashSet<String>)s1.clone();
        LinkedHashSet<String> sc2 = (LinkedHashSet<String>)s1.clone();
        LinkedHashSet<String> sc3 = (LinkedHashSet<String>)s1.clone();

        //union
        sc1.addAll(s2);
        System.out.println(sc1);

        //difference
        sc2.removeAll(s2);
        System.out.println(sc2);

        //intersection
        sc3.retainAll(s2);
        System.out.println(sc3);
    }
}
