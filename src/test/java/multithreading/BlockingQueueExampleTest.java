package multithreading;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import static org.junit.jupiter.api.Assertions.*;

class BlockingQueueExampleTest {

    @Test
    public void blockingQueeExampleTest() throws InterruptedException {
        BlockingQueue queue = new ArrayBlockingQueue(4);

        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);

        new Thread(producer).start();
        new Thread(consumer).start();

        Thread.sleep(2000);

        Assert.assertEquals(1,queue.size());
        Assert.assertTrue(queue.take().equals("4"));
    }

}