package Week14;

public class WordOccurrence implements Comparable<WordOccurrence>{
    private String word;
    private Integer count;

    public WordOccurrence(String word, int count){
        this.word = word;
        this.count = count;
    }

    @Override
    public int compareTo(WordOccurrence w){
        if(this.count > w.count){
            return 1;
        }else if(this.count < w.count){
            return -1;
        }else{
            return 0;
        }
    }
//    public int compareTo(WordOccurrence o) {
//        return o.count.compareTo(count);
//    }

    @Override /** Override the toString method in the */
    public String toString() {
        return word + "=" + count;
    }

}
