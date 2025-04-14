package com.learn.dataStructure.stack;

public class ArrayStack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public ArrayStack(int size) {
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1;
    }

    /**
     * 将元素压入栈顶
     * @param value 要压入的元素
     * @throws RuntimeException 当栈已满时抛出异常
     */
    public void push(int value) {
        if (isFull()) {
            throw new RuntimeException("Stack is full");
        }
        stackArray[++top] = value;
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
        return stackArray[top--];
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
        return stackArray[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }
}