package datastructures.queue;

import datastructures.queue.ArrayQueue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ArrayQueueTest {

    @Test
    public void testEnqueueAndDequeue(){
        ArrayQueue arrayQueue = new ArrayQueue();
        arrayQueue.enqueue("A");
        arrayQueue.enqueue("B");
        arrayQueue.enqueue("C");

        assertEquals(3,arrayQueue.size());
        assertEquals("A",arrayQueue.peek());
        arrayQueue.dequeue();

        assertEquals(2,arrayQueue.size());
    }

    @Test
    public void testEnqueueNull(){
        ArrayQueue arrayQueue = new ArrayQueue();

        Assertions.assertThrows(NullPointerException.class, () -> {
            arrayQueue.enqueue(null);
        });
        assertTrue(arrayQueue.isEmpty());
    }

    @Test
    public void testEnqueueAndPeek(){
        ArrayQueue arrayQueue = new ArrayQueue();
        arrayQueue.enqueue("A");
        arrayQueue.enqueue("B");
        arrayQueue.enqueue("C");

        assertFalse(arrayQueue.isEmpty());

        assertEquals(3,arrayQueue.size());
        assertEquals("A",arrayQueue.peek());
        assertEquals("A",arrayQueue.peek());
        assertEquals(3,arrayQueue.size());
    }

    @Test
    public void testDequeueAndPeek(){
        ArrayQueue arrayQueue = new ArrayQueue();
        arrayQueue.enqueue("A");
        arrayQueue.enqueue("B");
        arrayQueue.enqueue("C");

        assertFalse(arrayQueue.isEmpty());

        arrayQueue.dequeue();
        assertEquals("B",arrayQueue.peek());
        assertEquals(2,arrayQueue.size());
    }

    @Test
    public void testIsEmptyReturnTrueOnNewQueue() {
        ArrayQueue arrayQueue = new ArrayQueue();

        assertTrue(arrayQueue.isEmpty());
    }

    @Test
    public void testIsEmptyReturnFalseOnQueueWithData() {
        ArrayQueue arrayQueue = new ArrayQueue();
        arrayQueue.enqueue("A");
        arrayQueue.enqueue("A");

        assertFalse(arrayQueue.isEmpty());
    }

    @Test
    public void testIsEmptyReturnTrueOnStackAfterClear() {
        ArrayQueue arrayQueue = new ArrayQueue();
        arrayQueue.enqueue("A");
        arrayQueue.enqueue("A");

        arrayQueue.clear();

        assertTrue(arrayQueue.isEmpty());
    }

    @Test
    public void testContainsReturnTrue() {
        ArrayQueue arrayQueue = new ArrayQueue();
        arrayQueue.enqueue("A");
        arrayQueue.enqueue("A");
        arrayQueue.enqueue("B");
        arrayQueue.enqueue("D");

        assertTrue(arrayQueue.contains(new String("A")));
        assertTrue(arrayQueue.contains(new String("D")));
    }
}
