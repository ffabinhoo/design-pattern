package multithreading;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{

    protected BlockingQueue queue = null;

    public Producer(BlockingQueue queue) {
        this.queue = queue;
    }

    public void run() {
        try {
            queue.put("1");
            Thread.sleep(500);
            queue.put("2");
            Thread.sleep(500);
            queue.put("3");
            Thread.sleep(500);
            queue.put("4");


        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
