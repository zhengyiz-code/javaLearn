package com.learn.dataStructure.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackBenchmark {

    public static void main(String[] args) {
        int size = 10000000;
        
        // ArrayStack测试
        long start = System.currentTimeMillis();
        ArrayStack arrayStack = new ArrayStack(size);
        for (int i = 0; i < size; i++) {
            arrayStack.push(i);
        }
        for (int i = 0; i < size; i++) {
            arrayStack.pop();
        }
        System.out.println("ArrayStack耗时: " + (System.currentTimeMillis() - start) + "ms");
        
        // LinkedStack测试
        start = System.currentTimeMillis();
        LinkedStack linkedStack = new LinkedStack();
        for (int i = 0; i < size; i++) {
            linkedStack.push(i);
        }
        for (int i = 0; i < size; i++) {
            linkedStack.pop();
        }
        System.out.println("LinkedStack耗时: " + (System.currentTimeMillis() - start) + "ms");
        
        // ArrayDeque测试
        start = System.currentTimeMillis();
        Deque<Integer> arrayDeque = new ArrayDeque<>(size);
        for (int i = 0; i < size; i++) {
            arrayDeque.push(i);
        }
        for (int i = 0; i < size; i++) {
            arrayDeque.pop();
        }
        System.out.println("ArrayDeque耗时: " + (System.currentTimeMillis() - start) + "ms");
    }

}
