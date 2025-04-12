package com.learn.dataStructure.linkedlist;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DoublyLinkedListTest {
    
    @Test
    public void testAdd() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.add(1);
        list.add(2);
        assertEquals(2, list.size());
    }
    
    @Test
    public void testAddFirst() {
        DoublyLinkedList<String> list = new DoublyLinkedList<>();
        list.addFirst("first");
        list.addFirst("second");
        assertEquals(2, list.size());
    }
    
    @Test
    public void testInsert() {
        DoublyLinkedList<Character> list = new DoublyLinkedList<>();
        list.add('a');
        list.add('c');
        list.insert(1, 'b');
        assertEquals(3, list.size());
    }
    
    @Test
    public void testRemove() {
        DoublyLinkedList<Double> list = new DoublyLinkedList<>();
        list.add(1.1);
        list.add(2.2);
        list.add(3.3);
        assertEquals(2.2, list.remove(1));
        assertEquals(2, list.size());
    }
    
    @Test
    public void testSizeAndIsEmpty() {
        DoublyLinkedList<Boolean> list = new DoublyLinkedList<>();
        assertTrue(list.isEmpty());
        list.add(true);
        assertEquals(1, list.size());
        assertFalse(list.isEmpty());
    }
    
    @Test
    public void testIndexOutOfBounds() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        assertThrows(IndexOutOfBoundsException.class, () -> list.insert(-1, 0));
        assertThrows(IndexOutOfBoundsException.class, () -> list.remove(0));
    }
}