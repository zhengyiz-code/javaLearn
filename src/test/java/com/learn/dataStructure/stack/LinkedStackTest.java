package com.learn.dataStructure.stack;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LinkedStackTest {
    @Test
    public void testPushAndPeek() {
        LinkedStack stack = new LinkedStack();
        stack.push(1);
        assertEquals(1, stack.peek());
        stack.push(2);
        assertEquals(2, stack.peek());
    }

    @Test
    public void testPop() {
        LinkedStack stack = new LinkedStack();
        stack.push(1);
        stack.push(2);
        assertEquals(2, stack.pop());
        assertEquals(1, stack.pop());
    }

    @Test
    public void testIsEmpty() {
        LinkedStack stack = new LinkedStack();
        assertTrue(stack.isEmpty());
        stack.push(1);
        assertFalse(stack.isEmpty());
    }

    @Test
    public void testPopEmptyStack() {
        LinkedStack stack = new LinkedStack();
        assertThrows(RuntimeException.class, stack::pop);
    }

    @Test
    public void testPeekEmptyStack() {
        LinkedStack stack = new LinkedStack();
        assertThrows(RuntimeException.class, stack::peek);
    }
}