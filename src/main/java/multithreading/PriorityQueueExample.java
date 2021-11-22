package multithreading;

import java.util.PriorityQueue;

public class PriorityQueueExample {

    PriorityQueue<String> pqString =
            new PriorityQueue<String>(3, (a,b) -> a.length() - b.length());
    // or pq = new PriorityQueue<String>(5, Comparator.comparing(String::length));

    PriorityQueue<Integer> pqInteger = new PriorityQueue<>(5);

    public PriorityQueue<Integer> build2(){
        pqInteger.add(5);
        pqInteger.add(1);
        pqInteger.add(7);
        pqInteger.add(3);

        return pqInteger;
    }

    public PriorityQueue<String> build(){
        pqString.add("PineAppleeeeee");
        pqString.add("Apple");
        pqString.add("PineApple");
        return pqString;
    }

    public PriorityQueue<String> getPqString() {
        return pqString;
    }

    public PriorityQueue<Integer> getPqInteger() {
        return pqInteger;
    }
}
