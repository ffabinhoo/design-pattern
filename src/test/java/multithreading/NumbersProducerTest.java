package multithreading;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

class NumbersProducerTest {
    int BOUND = 10;
    int N_PRODUCERS = 4;
    int N_CONSUMERS = Runtime.getRuntime().availableProcessors();
    int maxValue = Integer.MAX_VALUE;
    int consumersDividedByProducers = N_CONSUMERS / N_PRODUCERS;
    int mod = N_CONSUMERS % N_PRODUCERS;

    BlockingQueue<Integer> queue = new LinkedBlockingQueue<>(BOUND);

    @Test
    public void numberProducerTest() throws InterruptedException {
        for (int i = 1; i < N_PRODUCERS; i++) {
            new Thread(new NumbersProducer(queue, maxValue, consumersDividedByProducers)).start();
        }

        for (int j = 0; j < N_CONSUMERS; j++) {
            new Thread(new NumbersConsumer(queue, maxValue)).start();
        }

        new Thread(new NumbersProducer(queue, maxValue, consumersDividedByProducers + mod)).start();


        TimeUnit.SECONDS.sleep(1);
        Assert.assertTrue(queue.size()==0);
    }

}