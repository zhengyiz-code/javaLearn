package com.learn.dataStructure.queue;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PriorityQueueTest {
    
    @Test
    public void testEnqueueDequeue() {
        PriorityQueue queue = new PriorityQueue(3);
        queue.enqueue(1);
        queue.enqueue(3);
        queue.enqueue(2);
        
        assertEquals(3, queue.dequeue());
        assertEquals(2, queue.dequeue());
        assertEquals(1, queue.dequeue());
    }
    
    @Test
    public void testIsEmpty() {
        PriorityQueue queue = new PriorityQueue(2);
        assertTrue(queue.isEmpty());
        
        queue.enqueue(1);
        assertFalse(queue.isEmpty());
        
        queue.dequeue();
        assertTrue(queue.isEmpty());
    }
    
    @Test
    public void testIsFull() {
        PriorityQueue queue = new PriorityQueue(2);
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
        PriorityQueue queue = new PriorityQueue(1);
        queue.enqueue(1);
        
        assertThrows(RuntimeException.class, () -> queue.enqueue(2));
    }
    
    @Test
    public void testEmptyException() {
        PriorityQueue queue = new PriorityQueue(1);
        
        assertThrows(RuntimeException.class, () -> queue.dequeue());
    }
}