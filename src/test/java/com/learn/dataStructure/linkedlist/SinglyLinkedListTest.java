package com.learn.dataStructure.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SinglyLinkedListTest {
    
    @Test
    public void testAdd() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(1);
        list.add(2);
        assertEquals(2, list.size());
        assertEquals(1, list.get(0));
        assertEquals(2, list.get(1));
    }
    
    @Test
    public void testInsert() {
        SinglyLinkedList<String> list = new SinglyLinkedList<>();
        list.add("a");
        list.add("c");
        list.insert(1, "b");
        assertEquals(3, list.size());
        assertEquals("a", list.get(0));
        assertEquals("b", list.get(1));
        assertEquals("c", list.get(2));
    }
    
    @Test
    public void testRemove() {
        SinglyLinkedList<Double> list = new SinglyLinkedList<>();
        list.add(1.1);
        list.add(2.2);
        list.add(3.3);
        double removed = list.remove(1);
        assertEquals(2, list.size());
        assertEquals(2.2, removed);
        assertEquals(1.1, list.get(0));
        assertEquals(3.3, list.get(1));
    }
    
    @Test
    public void testGet() {
        SinglyLinkedList<Character> list = new SinglyLinkedList<>();
        list.add('a');
        list.add('b');
        assertEquals('a', list.get(0));
        assertEquals('b', list.get(1));
    }
    
    @Test
    public void testSizeAndIsEmpty() {
        SinglyLinkedList<Boolean> list = new SinglyLinkedList<>();
        assertTrue(list.isEmpty());
        list.add(true);
        assertEquals(1, list.size());
        assertFalse(list.isEmpty());
    }
    
    @Test
    public void testReverse() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.reverse();
        assertEquals(3, list.get(0));
        assertEquals(2, list.get(1));
        assertEquals(1, list.get(2));
    }
    
    @Test
    public void testHasCycle() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        assertFalse(list.hasCycle());
    }
    
    @Test
    public void testContains() {
        SinglyLinkedList<String> list = new SinglyLinkedList<>();
        list.add("apple");
        list.add("banana");
        list.add("orange");
        
        assertTrue(list.contains("banana"));
        assertFalse(list.contains("grape"));
        assertFalse(list.contains(null));
    }
    
    @Test
    public void testTraverse() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        
        // 测试遍历输出
        list.traverse();
        
        // 测试空链表遍历
        SinglyLinkedList<Integer> emptyList = new SinglyLinkedList<>();
        emptyList.traverse();
    }
}