package Week12;

public final class Card{
    private String value;

    public Card() {
        this.value = "Default";
    }

    public Card(String value){
        this.value = value;
    }

    public String toString(){
        return value;
    }
}
