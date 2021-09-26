package multithreading;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PriorityQueueExampleTest {
    PriorityQueueExample example = new PriorityQueueExample();

    @Test
    public void testPriorityQueue(){
        example.build();
        Assert.assertEquals(3, example.getPq().size());
        Assert.assertEquals("Apple", example.getPq().poll());
        Assert.assertEquals(2, example.getPq().size());
        Assert.assertEquals("PineApple", example.getPq().peek());
        Assert.assertEquals(2, example.getPq().size());
        example.getPq().offer("xxxxxxxxxxxxxxxxxxxx");
        Assert.assertEquals(3, example.getPq().size());
        Assert.assertEquals("PineApple", example.getPq().poll());



    }

}