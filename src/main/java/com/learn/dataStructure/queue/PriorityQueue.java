package com.learn.dataStructure.queue;

public class PriorityQueue {
    
    private int[] heap; // 存储元素的数组
    
    private int size; // 当前元素数量

    private int capacity; //  最大容量

    public PriorityQueue(int capacity) {
        this.capacity = capacity;
        this.heap = new int[capacity];
        this.size = 0;
    }

    /**
     * 入队操作 - 将元素插入到优先队列中
     * @param value 要插入的元素值
     * @throws RuntimeException 如果队列已满则抛出异常
     * 实现原理:
     * 1. 将新元素添加到队列末尾
     * 2. 执行上浮操作(heapifyUp)调整堆结构
     */
    public void enqueue(int value) {
        if (isFull()) {
            throw new RuntimeException("Priority queue is full");
        }
        heap[size] = value;
        heapifyUp(size);
        size++;
    }

    /**
     * 出队操作 - 移除并返回优先级最高的元素(堆顶元素)
     * @return 优先级最高的元素
     * @throws RuntimeException 如果队列为空则抛出异常
     * 实现原理:
     * 1. 取出堆顶元素(最大值)
     * 2. 将堆末尾元素移到堆顶
     * 3. 执行下沉操作(heapifyDown)调整堆结构
     */
    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Priority queue is empty");
        }
        int max = heap[0];
        heap[0] = heap[size - 1];
        size--;
        heapifyDown(0);
        return max;
    }

    /**
     * 上浮操作 - 从指定位置向上调整队列结构
     * @param index 需要上浮的节点索引
     * 实现原理:
     * 1. 计算父节点位置
     * 2. 如果当前节点值大于父节点值，则交换它们
     * 3. 递归向上调整直到满足队列性质
     */
    private void heapifyUp(int index) {
        int parent = (index - 1) / 2;
        if (index > 0 && heap[index] > heap[parent]) {
            swap(index, parent);
            heapifyUp(parent);
        }
    }

    /**
     * 下沉操作 - 从指定位置向下调整队列结构
     * @param index 需要下沉的节点索引
     * 实现原理:
     * 1. 计算左右子节点位置
     * 2. 找出当前节点、左子节点、右子节点中的最大值
     * 3. 如果最大值不是当前节点，则交换它们
     * 4. 递归向下调整直到满足队列性质
     */
    private void heapifyDown(int index) {
        int left = 2 * index + 1;
        int right = 2 * index + 2;
        int largest = index;

        if (left < size && heap[left] > heap[largest]) {
            largest = left;
        }

        if (right < size && heap[right] > heap[largest]) {
            largest = right;
        }

        if (largest != index) {
            swap(index, largest);
            heapifyDown(largest);
        }
    }

    /**
     * 交换中两个元素的位置
     * @param i 第一个元素的索引
     * @param j 第二个元素的索引
     */
    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    /**
     * 判断队列是否为空
     * @return 如果队列为空返回true，否则返回false
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * 判断队列是否已满
     * @return 如果队列已满返回true，否则返回false
     */
    public boolean isFull() {
        return size == capacity;
    }
}