package multithreading;

import java.util.PriorityQueue;
import java.util.concurrent.SynchronousQueue;

public class PriorityQueueExample {

    PriorityQueue<String> pq =
            new PriorityQueue<String>(3, (a,b) -> a.length() - b.length());
    // or pq = new PriorityQueue<String>(5, Comparator.comparing(String::length));

    SynchronousQueue<String> sq = new SynchronousQueue<>();

    public PriorityQueue<String> build(){
        pq.add("PineAppleeeeee");
        pq.add("Apple");
        pq.add("PineApple");
        return pq;
    }

    public PriorityQueue<String> getPq() {
        return pq;
    }
}
