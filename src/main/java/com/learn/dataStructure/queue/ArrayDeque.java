package com.learn.dataStructure.queue;

public class ArrayDeque {
    private int[] elements;  // 存储队列元素的数组，使用循环数组实现
    private int head;       // 队列头部指针，指向第一个元素的位置
    private int tail;       // 队列尾部指针，指向下一个可插入元素的位置
    private int size;       // 当前队列元素数量，用于快速判断空/满状态
    private int capacity;   // 队列容量，固定大小

    /**
     * 构造函数 - 初始化双端队列
     * @param capacity 队列容量
     * 实现原理: 初始化固定大小的数组，所有指针归零
     * 边界条件: 容量必须大于0，否则会抛出NegativeArraySizeException
     */
    public ArrayDeque(int capacity) {
        this.capacity = capacity;
        this.elements = new int[capacity];
        this.head = 0;  // 头部指针初始指向0
        this.tail = 0;  // 尾部指针初始指向0
        this.size = 0;  // 初始元素数量为0
    }

    /**
     * 在队列头部添加元素
     * @param value 要添加的元素值
     * @throws RuntimeException 如果队列已满则抛出异常
     * 实现原理: 
     * 1. 头部指针向前移动一位(使用模运算处理循环数组边界)
     * 2. 当head为0时，(head-1+capacity)%capacity会指向数组末尾
     * 3. 新元素插入到新的head位置
     * 时间复杂度: O(1)
     */
    public void addFirst(int value) {
        if (isFull()) {
            throw new RuntimeException("Deque is full");
        }
        head = (head - 1 + capacity) % capacity;  // 循环数组处理
        elements[head] = value;
        size++;
    }

    /**
     * 在队列尾部添加元素
     * @param value 要添加的元素值
     * @throws RuntimeException 如果队列已满则抛出异常
     * 实现原理: 
     * 1. 元素直接插入当前tail位置
     * 2. 尾部指针向后移动一位(使用模运算处理循环数组边界)
     * 3. 当tail到达数组末尾时，(tail+1)%capacity会指向数组开头
     * 时间复杂度: O(1)
     */
    public void addLast(int value) {
        if (isFull()) {
            throw new RuntimeException("Deque is full");
        }
        elements[tail] = value;
        tail = (tail + 1) % capacity;  // 循环数组处理
        size++;
    }

    /**
     * 移除并返回队列头部元素
     * @return 被移除的队头元素
     * @throws RuntimeException 如果队列为空则抛出异常
     * 实现原理: 
     * 1. 获取当前head位置的元素
     * 2. 头部指针向后移动一位(使用模运算处理循环数组边界)
     * 3. 当head到达数组末尾时，(head+1)%capacity会指向数组开头
     * 时间复杂度: O(1)
     */
    public int removeFirst() {
        if (isEmpty()) {
            throw new RuntimeException("Deque is empty");
        }
        int value = elements[head];
        head = (head + 1) % capacity;  // 循环数组处理
        size--;
        return value;
    }

    /**
     * 移除并返回队列尾部元素
     * @return 被移除的队尾元素
     * @throws RuntimeException 如果队列为空则抛出异常
     * 实现原理: 
     * 1. 尾部指针向前移动一位(使用模运算处理循环数组边界)
     * 2. 当tail为0时，(tail-1+capacity)%capacity会指向数组末尾
     * 3. 返回新的tail位置的元素
     * 时间复杂度: O(1)
     */
    public int removeLast() {
        if (isEmpty()) {
            throw new RuntimeException("Deque is empty");
        }
        tail = (tail - 1 + capacity) % capacity;  // 循环数组处理
        int value = elements[tail];
        size--;
        return value;
    }

    /**
     * 判断队列是否为空
     * @return 如果队列为空返回true，否则返回false
     * 实现原理: 通过size变量判断，比比较head和tail更可靠
     * 时间复杂度: O(1)
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * 判断队列是否已满
     * @return 如果队列已满返回true，否则返回false
     * 实现原理: 通过size变量判断，比比较head和tail更可靠
     * 时间复杂度: O(1)
     */
    public boolean isFull() {
        return size == capacity;
    }
}