package Practice;

import java.util.Comparator;

public class NumberOfWorkersComparator implements Comparator<SuperMarket>, java.io.Serializable{
//    private String name;
//    private int numberOfWorkers;
//
//    public NumberOfWorkersComparator(String name, int numberOfWorkers){
//        this.name = name;
//        this.numberOfWorkers = numberOfWorkers;
//    }
    public int compare(SuperMarket s1, SuperMarket s2){
        int numberOfWorkers1 = s1.getNumberOfWorkers();
        int numberOfWorkers2 = s2.getNumberOfWorkers();

        if(numberOfWorkers1 < numberOfWorkers2){
            return -1;
        }else if(numberOfWorkers1 == numberOfWorkers2){
            return 0;
        }else{
            return -1;
        }
    }
}
