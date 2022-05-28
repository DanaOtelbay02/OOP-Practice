package Practice;

import java.util.Comparator;

public class NumberOfBranchesComparator implements Comparator<SuperMarket> {
    private String name;
    private int numberOfBranches;
    public NumberOfBranchesComparator(String name, int numberOfBranches){
        this.name = name;
        this.numberOfBranches = numberOfBranches;
    }
    public int compare(SuperMarket s1, SuperMarket s2){

    }
}
