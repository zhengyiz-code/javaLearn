package com.learn.dataStructure.stack;

public class LinkedStack {
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    private Node top;

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    /**
     * 弹出并返回栈顶元素
     * @return 栈顶元素
     * @throws RuntimeException 当栈为空时抛出异常
     */
    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        int data = top.data;
        top = top.next;
        return data;
    }

    /**
     * 查看栈顶元素但不移除
     * @return 栈顶元素
     * @throws RuntimeException 当栈为空时抛出异常
     */
    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }
}