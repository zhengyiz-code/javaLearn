package com.learn.dataStructure.stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayStackTest {
    private ArrayStack stack;

    @BeforeEach
    public void setUp() {
        stack = new ArrayStack(3);
    }

    @Test
    public void testPushAndPop() {
        stack.push(1);
        stack.push(2);
        assertEquals(2, stack.pop());
        assertEquals(1, stack.pop());
    }

    @Test
    public void testPeek() {
        stack.push(1);
        stack.push(2);
        assertEquals(2, stack.peek());
        assertEquals(2, stack.pop());
    }

    @Test
    public void testIsEmpty() {
        assertTrue(stack.isEmpty());
        stack.push(1);
        assertFalse(stack.isEmpty());
    }

    @Test
    public void testIsFull() {
        assertFalse(stack.isFull());
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertTrue(stack.isFull());
    }

    @Test
    public void testPopEmptyStack() {
        assertThrows(RuntimeException.class, () -> stack.pop());
    }

    @Test
    public void testPeekEmptyStack() {
        assertThrows(RuntimeException.class, () -> stack.peek());
    }

    @Test
    public void testPushFullStack() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertThrows(RuntimeException.class, () -> stack.push(4));
    }
}