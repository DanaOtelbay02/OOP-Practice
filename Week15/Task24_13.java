package Week15;

import java.util.Iterator;

public class Task24_13 {
    public static void main(String[] args) {
        Iterator<Integer> iterator = new FibonacciIterator(100000);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    static class FibonacciIterator implements java.util.Iterator<Integer> {
        private int limit;
        private int current = 1;//-1,1,0,1,1,2,3,5
        private int prev=-1;

        public FibonacciIterator(int limit) {
            this.limit = limit;
        }

        @Override
        public Integer next() {
            return current;
        }
        @Override
        public boolean hasNext() {
            int temp=current;
            current=current+prev;//-1+1=0
            prev=temp;
            if (current >= limit)
                return false;
            else
                return true;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException
                    ("Method not supported");
        }
    }

}
