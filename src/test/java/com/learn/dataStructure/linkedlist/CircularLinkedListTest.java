package com.learn.dataStructure.linkedlist;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CircularLinkedListTest {
    @Test
    public void testAdd() {
        CircularLinkedList<Integer> list = new CircularLinkedList<>();
        assertTrue(list.size() == 0);
        
        list.add(1);
        assertEquals(1, list.size());
        
        list.add(2);
        list.add(3);
        assertEquals(3, list.size());
    }
    
    @Test
    public void testTraverse() {
        CircularLinkedList<String> list = new CircularLinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        
        // 由于traverse方法直接输出到控制台，这里主要测试方法是否能正常执行
        list.traverse();
    }
}