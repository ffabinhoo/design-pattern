package multithreading;

import java.util.PriorityQueue;

public class PriorityQueueExample {

    PriorityQueue<String> pq =
            new PriorityQueue<String>(5, (a,b) -> a.length() - b.length());
    // or pq = new PriorityQueue<String>(5, Comparator.comparing(String::length));

    public PriorityQueue<String> build(){
        pq.add("Apple");
        pq.add("Custard Apple");
        pq.add("PineApple");
        return pq;
    }

    public PriorityQueue<String> getPq() {
        return pq;
    }
}
