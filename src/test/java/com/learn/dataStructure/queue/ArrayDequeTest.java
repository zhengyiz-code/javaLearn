package com.learn.dataStructure.queue;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayDequeTest {
    
    @Test
    public void testAddFirstAndRemoveFirst() {
        ArrayDeque deque = new ArrayDeque(3);
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addFirst(3);
        
        assertEquals(3, deque.removeFirst());
        assertEquals(2, deque.removeFirst());
        assertEquals(1, deque.removeFirst());
    }
    
    @Test
    public void testAddLastAndRemoveLast() {
        ArrayDeque deque = new ArrayDeque(3);
        deque.addLast(1);
        deque.addLast(2);
        deque.addLast(3);
        
        assertEquals(3, deque.removeLast());
        assertEquals(2, deque.removeLast());
        assertEquals(1, deque.removeLast());
    }
    
    @Test
    public void testMixedOperations() {
        ArrayDeque deque = new ArrayDeque(5);
        deque.addFirst(2);
        deque.addLast(3);
        deque.addFirst(1);
        deque.addLast(4);
        
        assertEquals(1, deque.removeFirst());
        assertEquals(4, deque.removeLast());
        assertEquals(2, deque.removeFirst());
        assertEquals(3, deque.removeLast());
    }
    
    @Test
    public void testIsEmpty() {
        ArrayDeque deque = new ArrayDeque(2);
        assertTrue(deque.isEmpty());
        
        deque.addFirst(1);
        assertFalse(deque.isEmpty());
        
        deque.removeFirst();
        assertTrue(deque.isEmpty());
    }
    
    @Test
    public void testIsFull() {
        ArrayDeque deque = new ArrayDeque(2);
        assertFalse(deque.isFull());
        
        deque.addFirst(1);
        assertFalse(deque.isFull());
        
        deque.addLast(2);
        assertTrue(deque.isFull());
        
        deque.removeFirst();
        assertFalse(deque.isFull());
    }
    
    @Test
    public void testFullException() {
        ArrayDeque deque = new ArrayDeque(1);
        deque.addFirst(1);
        
        assertThrows(RuntimeException.class, () -> deque.addFirst(2));
        assertThrows(RuntimeException.class, () -> deque.addLast(2));
    }
    
    @Test
    public void testEmptyException() {
        ArrayDeque deque = new ArrayDeque(1);
        
        assertThrows(RuntimeException.class, () -> deque.removeFirst());
        assertThrows(RuntimeException.class, () -> deque.removeLast());
    }
}