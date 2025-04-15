package com.learn.dataStructure.queue;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayQueueTest {
    
    @Test
    public void testEnqueueDequeue() {
        ArrayQueue queue = new ArrayQueue(3);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        
        assertEquals(1, queue.dequeue());
        assertEquals(2, queue.dequeue());
        assertEquals(3, queue.dequeue());
    }
    
    @Test
    public void testPeek() {
        ArrayQueue queue = new ArrayQueue(2);
        queue.enqueue(1);
        assertEquals(1, queue.peek());
        
        queue.enqueue(2);
        assertEquals(1, queue.peek());
        
        queue.dequeue();
        assertEquals(2, queue.peek());
    }
    
    @Test
    public void testIsEmpty() {
        ArrayQueue queue = new ArrayQueue(2);
        assertTrue(queue.isEmpty());
        
        queue.enqueue(1);
        assertFalse(queue.isEmpty());
        
        queue.dequeue();
        assertTrue(queue.isEmpty());
    }
    
    @Test
    public void testIsFull() {
        ArrayQueue queue = new ArrayQueue(2);
        assertFalse(queue.isFull());
        
        queue.enqueue(1);
        assertFalse(queue.isFull());
        
        queue.enqueue(2);
        assertTrue(queue.isFull());
        
        queue.dequeue();
        assertFalse(queue.isFull());
    }
    
    @Test
    public void testFullException() {
        ArrayQueue queue = new ArrayQueue(1);
        queue.enqueue(1);
        
        assertThrows(RuntimeException.class, () -> queue.enqueue(2));
    }
    
    @Test
    public void testEmptyException() {
        ArrayQueue queue = new ArrayQueue(1);
        
        assertThrows(RuntimeException.class, () -> queue.dequeue());
        assertThrows(RuntimeException.class, () -> queue.peek());
    }
}