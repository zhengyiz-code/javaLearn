package com.learn.dataStructure.queue;

public class LinkedQueue {

    private static class Node {
        int data;   // 节点存储的数据
        Node next;  // 指向下一个节点的引用

        Node(int data) {
            this.data = data;
        }
    }

    private Node front; // 队头指针，指向队列第一个节点
    private Node rear;  // 队尾指针，指向队列最后一个节点

    /**
     * 入队操作 - 将新元素添加到队列尾部
     * @param data 要添加的元素值
     * 实现原理:
     * 1. 创建新节点
     * 2. 如果队列为空，设置front和rear都指向新节点
     * 3. 否则将新节点链接到rear节点后面，并更新rear指针
     */
    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
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
        int data = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return data;
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
        return front.data;
    }

    /**
     * 判断队列是否为空
     * @return 如果队列为空返回true，否则返回false
     * 实现原理: 通过检查front指针是否为null来判断队列是否为空
     */
    public boolean isEmpty() {
        return front == null;
    }
}