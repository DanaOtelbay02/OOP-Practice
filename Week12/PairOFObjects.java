package Week12;

public class PairOFObjects {
    public static void main(String[] args){
//        Pair<Integer, Card> p = new Pair<Integer, Card>(1, new Card("Name"));
//        Pair<Integer, String> p = new Pair<Integer, String>(1, "NameString");
        Pair<Card, Character> p = new Pair<Card, Character>(new Card("Name1"), '!');
        System.out.print(p.getFirst() + " " + p.getSecond());
    }
}


