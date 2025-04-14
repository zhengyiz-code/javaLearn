package com.learn.dataStructure.linkedlist;

public class CircularLinkedList<T> {
    private static class Node<T> {
        T data;
        Node<T> next;
        
        Node(T data) {
            this.data = data;
            this.next = this; // 初始时指向自己
        }
    }
    
    private Node<T> head;
    private int size;
    
    // 添加元素到链表末尾
    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = newNode;
            newNode.next = head;
        }
        size++;
    }
    
    // 遍历链表
    public void traverse() {
        if (head == null) return;
        
        Node<T> current = head;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
    }
    
    // 获取链表大小
    public int size() {
        return size;
    }
}