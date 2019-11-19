package ua.edu.ucu.collections;

import org.junit.Test;
import static org.junit.Assert.*;

public class StackTest {

    private Stack testStack = new Stack();

    @Test
    public void testPush() {
        testStack.push(5);
        assertEquals(5, testStack.peek());
    }

    @Test
    public void testPeek(){
        testStack.push(12);
        testStack.push(10);
        testStack.push(5);
        assertEquals(5, testStack.peek());
    }

    @Test
    public void testDequeue(){
        testStack.push(12);
        testStack.push(10);
        testStack.push(7);
        testStack.push(5);
        testStack.pop();
        assertEquals(10, testStack.peek());
    }
    
}
