package com.learn.dataStructure.queue;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LinkedQueueTest {
    
    @Test
    public void testEnqueueDequeue() {
        LinkedQueue queue = new LinkedQueue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        
        assertEquals(1, queue.dequeue());
        assertEquals(2, queue.dequeue());
        assertEquals(3, queue.dequeue());
    }
    
    @Test
    public void testPeek() {
        LinkedQueue queue = new LinkedQueue();
        queue.enqueue(1);
        assertEquals(1, queue.peek());
        
        queue.enqueue(2);
        assertEquals(1, queue.peek());
        
        queue.dequeue();
        assertEquals(2, queue.peek());
    }
    
    @Test
    public void testIsEmpty() {
        LinkedQueue queue = new LinkedQueue();
        assertTrue(queue.isEmpty());
        
        queue.enqueue(1);
        assertFalse(queue.isEmpty());
        
        queue.dequeue();
        assertTrue(queue.isEmpty());
    }
    
    @Test
    public void testEmptyException() {
        LinkedQueue queue = new LinkedQueue();
        
        assertThrows(RuntimeException.class, () -> queue.dequeue());
        assertThrows(RuntimeException.class, () -> queue.peek());
    }
}