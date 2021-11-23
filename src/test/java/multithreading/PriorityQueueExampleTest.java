package multithreading;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class PriorityQueueExampleTest {
    PriorityQueueExample example = new PriorityQueueExample();

    @Test
    public void testPriorityQueue(){
        example.build();

        Assert.assertEquals(3, example.getPqString().size());
        Assert.assertEquals("Apple", example.getPqString().peek());
        Assert.assertEquals("Apple", example.getPqString().poll());
        Assert.assertEquals(2, example.getPqString().size());
        Assert.assertEquals("PineApple", example.getPqString().peek());
        Assert.assertEquals(2, example.getPqString().size());
        example.getPqString().offer("xxxxxxxxxxxxxxxxxxxx");
        Assert.assertEquals(3, example.getPqString().size());
        Assert.assertEquals("PineApple", example.getPqString().poll());
    }

    @Test
    public void testPriorityQueueInteger(){
        example.build2();
        Assert.assertEquals(4, example.getPqInteger().size());
        Assert.assertEquals(new Integer(1), example.getPqInteger().peek());
        Assert.assertEquals(new Integer(1), example.getPqInteger().poll());
        example.getPqInteger().offer(2);
        Assert.assertEquals(new Integer(2), example.getPqInteger().peek());



    }

}