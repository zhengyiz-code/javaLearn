package com.learn.dataStructure.queue;

import java.util.Queue;

public class QueueBenchmark {
    public static void main(String[] args) {
        int size = 100000000;

        // ArrayQueue测试
        long start = System.currentTimeMillis();
        ArrayQueue arrayQueue = new ArrayQueue(size);
        for (int i = 0; i < size; i++) {
            arrayQueue.enqueue(i);
        }
        for (int i = 0; i < size; i++) {
            arrayQueue.dequeue();
        }
        System.out.println("ArrayQueue耗时: " + (System.currentTimeMillis() - start) + "ms");

        // LinkedQueue测试
        start = System.currentTimeMillis();
        LinkedQueue linkedQueue = new LinkedQueue();
        for (int i = 0; i < size; i++) {
            linkedQueue.enqueue(i);
        }
        for (int i = 0; i < size; i++) {
            linkedQueue.dequeue();
        }
        System.out.println("LinkedQueue耗时: " + (System.currentTimeMillis() - start) + "ms");

        //双端队列测试
        start = System.currentTimeMillis();
        ArrayDeque arrayDeque = new ArrayDeque(size);
        for (int i = 0; i < size; i++) {
            arrayDeque.addFirst(i);
        }
        for (int i = 0; i < size; i++) {
            arrayDeque.removeFirst();
        }
        System.out.println("ArrayDeque耗时: " + (System.currentTimeMillis() - start) + "ms");

        // PriorityQueue测试
        start = System.currentTimeMillis();
        PriorityQueue priorityQueue = new PriorityQueue(size);
        for (int i = 0; i < size; i++) {
            priorityQueue.enqueue(i);
        }
        for (int i = 0; i < size; i++) {
            priorityQueue.dequeue();
        }
        System.out.println("PriorityQueue耗时: " + (System.currentTimeMillis() - start) + "ms");
    }
}
