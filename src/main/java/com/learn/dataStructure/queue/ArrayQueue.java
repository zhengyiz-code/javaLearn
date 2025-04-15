package com.learn.dataStructure.queue;

public class ArrayQueue {
    private int maxSize;       // 队列的最大容量
    private int[] queueArray; // 存储队列元素的数组
    private int front;        // 队头指针，指向队列第一个元素
    private int rear;         // 队尾指针，指向队列最后一个元素
    private int size;         // 当前队列中的元素数量

    public ArrayQueue(int size) {
        this.maxSize = size;
        this.queueArray = new int[maxSize];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    /**
     * 入队操作 - 将新元素添加到队列尾部
     * @param value 要添加的元素值
     * @throws RuntimeException 如果队列已满则抛出异常
     * 示例: queue.enqueue(5) 将5加入队列
     */
    public void enqueue(int value) {
        if (isFull()) {
            throw new RuntimeException("Queue is full");
        }
        rear = (rear + 1) % maxSize;
        queueArray[rear] = value;
        size++;
    }

    /**
     * 出队操作 - 移除并返回队列头部的元素
     * @return 被移除的队头元素
     * @throws RuntimeException 如果队列为空则抛出异常
     * 示例: int first = queue.dequeue() 获取并移除第一个元素
     */
    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        int value = queueArray[front];
        front = (front + 1) % maxSize;
        size--;
        return value;
    }

    /**
     * 查看队头元素(不移除)
     * @return 当前队头元素的值
     * @throws RuntimeException 如果队列为空则抛出异常
     * 示例: int first = queue.peek() 查看但不移除第一个元素
     */
    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return queueArray[front];
    }

    /**
     * 判断队列是否为空
     * @return 如果队列为空返回true，否则返回false
     * 实现原理: 通过size变量判断队列是否为空
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * 判断队列是否已满
     * @return 如果队列已满返回true，否则返回false
     * 实现原理: 比较当前元素数量与队列最大容量
     */
    public boolean isFull() {
        return size == maxSize;
    }
}