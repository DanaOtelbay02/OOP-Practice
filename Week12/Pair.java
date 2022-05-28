package Week12;

public class Pair<F, S>{
    private F first;
    private S second;

    public Pair(){
    }

    public Pair(F first, S second){
        this.first = first;
        this.second = second;
    }

    public void setFirst(F first) {
        this.first = first;
    }

    public void setSecond(S second) {
        this.second = second;
    }

    public F getFirst() {
        return (F)first.toString();
    }

    public S getSecond() {
        return (S)second.toString();
    }

//    @Override
//    public boolean equals(Object o){
//        if(!(o instanceof Pair)){
//            return false;
//        }
//        Pair<?, ?> p = (Pair<?, ?>) o;
//        return Objects.equal(p.first, first) && Objects.equal(p.second, second);
//    }

//    @Override
//    public int hashCode() {
//        return (first == null ? 0 : first.hashCode()) ^ (second == null ? 0 : second.hashCode());
//    }

//    public static <A, B> Pair <A, B> create(A a, B b) {
//        return new Pair<A, B>(a, b);
//    }
}