package Practice;

import java.util.Comparator;

public class RatingComparator implements Comparator<SuperMarket> {
    private String name;
    private double rating;

    public RatingComparator(String name, double rating){
        this.name = name;
        this.rating = rating;
    }
    public int compare(SuperMarket s1, SuperMarket s2){

    }
}
