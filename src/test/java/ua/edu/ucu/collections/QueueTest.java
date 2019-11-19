package ua.edu.ucu.collections;

import org.junit.Test;
import static org.junit.Assert.*;

public class QueueTest {
    private Queue testQueue = new Queue();

    @Test
    public void testEnqueue() {
        testQueue.enqueue(5);
        assertEquals(5, testQueue.peek());
    }

    @Test
    public void testPeek(){
        testQueue.enqueue(12);
        testQueue.enqueue(10);
        testQueue.enqueue(5);
        assertEquals(12, testQueue.peek());
    }

    @Test
    public void testDequeue(){
        testQueue.enqueue(12);
        testQueue.enqueue(10);
        testQueue.enqueue(7);
        testQueue.enqueue(5);
        testQueue.dequeue();
        assertEquals(10, testQueue.peek());
    }
    
}
