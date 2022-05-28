package Practice;

public class SuperMarket{
    private String name;
    private int numberOfWorkers;
    private int numberOfBranches;
    private double rating;

    public SuperMarket(String name, int numberOfWorkers, int numberOfBranches, double rating){
        this.name = name;
        this.numberOfWorkers = numberOfWorkers;
        this.numberOfBranches = numberOfBranches;
        this.rating = rating;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getNumberOfWorkers(){
        return numberOfWorkers;
    }

    public void setNumberOfWorkers(int numberOfWorkers){
        this.numberOfWorkers = numberOfWorkers;
    }

    public int getNumberOfBranches(){
        return numberOfBranches;
    }

    public void setNumberOfBranches(int numberOfBranches){
        this.numberOfBranches = numberOfBranches;
    }

    public double getRating(){
        return rating;
    }

    public void setRating(double rating){
        this.rating = rating;
    }

    public int workerPerBranch(){
        return numberOfWorkers / numberOfBranches;
    }

    public String toString(){
        return name + " with the rating " + rating + " has " + numberOfWorkers + " workers and " + numberOfBranches + " branches";
    }
}
