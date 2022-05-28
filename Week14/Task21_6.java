package Week14;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task21_6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a = 4;
        int count = 0;

        Map<Integer, Integer> nums = new HashMap<Integer, Integer>();

        while(a != 0){
            a = input.nextInt();
            if(a == 0) break;
            if(nums.containsKey(a)){
                nums.put(a, nums.get(a) + 1);
            }else{
                nums.put(a, 1);
            }
        }

//        List<Integer> byValue = new ArrayList<>(nums.values());
//
//        Collections.sort(byValue);

        Map<Integer, Integer> result = nums.entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));

        int max = 0;
        for(Map.Entry<Integer, Integer> item : result.entrySet()){
            if(item.getValue() > max){
                max = item.getValue();
            }
        }

        for(Map.Entry<Integer, Integer> item : result.entrySet()){
            if(item.getValue() == max){
                System.out.println(item.getKey());
            }
        }

//        Map<String, Person> people = new HashMap<String, Person>();
//        people.put("1240i54", new Person("Tom"));
//        people.put("1564i55", new Person("Bill"));
//        people.put("4540i56", new Person("Nick"));

//        for(Map.Entry<Integer, Integer> item : nums.entrySet()){
//            System.out.printf("Key: %s  Value: %s \n", item.getKey(), item.getValue().getName());
//            System.out.printf("Key: %d  Value: %s \n", item.getKey(), item.getValue());

//        }

//        Collection<Integer> values = nums.values();


//        Stream<Map.Entry<Integer, Integer>> sorted = //entries sorted in ascending order of value
//                nums.entrySet().stream()
//                        .sorted(Map.Entry.comparingByValue());

        //descending value, simply reverse the comparator:
//        Stream<Map.Entry<Integer, Integer>> sorted =
//                nums.entrySet().stream()
//                        .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()));

//        sorted.forEach(System.out::println);

//        System.out.println(sorted.findFirst());
        //If the values are not comparable, you can pass an explicit comparato
//        Stream<Map.Entry<K,V>> sorted =
//                map.entrySet().stream()
//                        .sorted(Map.Entry.comparingByValue(comparator));

        // top 10 in a new map
//        Map<K,V> topTen =
//                map.entrySet().stream()
//                        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
//                        .limit(10)
//                        .collect(Collectors.toMap(
//                                Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

    }
}
//class ValueComparator implements Comparator<String> {
//    Map<String, Double> base;
//
//    public ValueComparator(Map<String, Double> base) {
//        this.base = base;
//    }
//
//    // Note: this comparator imposes orderings that are inconsistent with
//    // equals.
//    public int compare(String a, String b) {
//        if (base.get(a) >= base.get(b)) {
//            return -1;
//        } else {
//            return 1;
//        } // returning 0 would merge keys
//    }
//}
