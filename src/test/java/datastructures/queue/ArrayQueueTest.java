package datastructures.queue;

import datastructures.stack.ArrayStack;
import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/*void enqueue(Object value);
    Object dequeue();
    Object peek();
    int size();
    boolean isEmpty();
    boolean contains(Object value);
    void clear();*/

public class ArrayQueueTest {

    @Test
    public void testEnqueueAndPeek(){
        ArrayQueue arrayQueue = new ArrayQueue();
        arrayQueue.enqueue("A");
        arrayQueue.enqueue("B");
        arrayQueue.enqueue("C");

        assertEquals(3,arrayQueue.size());

        assertEquals("A",arrayQueue.dequeue());
        assertEquals("B",arrayQueue.dequeue());
        assertEquals("C",arrayQueue.dequeue());
        assertTrue(arrayQueue.isEmpty());
    }

    @Test
    public void testDequeueAndPeek(){

    }

    @Test
    public void testIsEmptyReturnTrueOnNewQueue() {
        ArrayStack arrayStack = new ArrayStack();

        assertTrue(arrayStack.isEmpty());
    }

    @Test
    public void testIsEmptyReturnFalseOnQueueWithData() {
        ArrayQueue arrayQueue = new ArrayQueue();
        arrayQueue.enqueue("A");

        assertFalse(arrayQueue.isEmpty());
    }
}
