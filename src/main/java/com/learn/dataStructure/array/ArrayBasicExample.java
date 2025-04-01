package com.learn.dataStructure.array;

import java.util.Arrays;

/**
 * 数组基础操作示例
 * 展示数组的声明、初始化、赋值和遍历等基本操作
 */
public class ArrayBasicExample {
    public static void main(String[] args) {
        // 数组声明与初始化 - 创建一个长度为5的整型数组
        // 注意：数组长度固定后不可改变
        int[] numbers = new int[5];
        
        // 赋值 - 数组索引从0开始
        // 常见错误：访问越界索引如numbers[5]会抛出ArrayIndexOutOfBoundsException
        numbers[0] = 10;
        numbers[1] = 20;
        
        // 遍历数组 - 时间复杂度O(n)
        // 性能提示：对于大数据量，考虑使用增强for循环或流式处理
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
        
        // 数组初始化简写 - 声明同时初始化
        // 内存分配：在栈中分配引用，在堆中连续分配元素空间
        String[] names = {"Alice", "Bob", "Charlie"};
        // 增强for循环 - 简化遍历
        // 语法糖：编译器会自动转换为迭代器遍历
        for (String name : names) {
            System.out.println("Name: " + name);
        }
    }
}