package com.learn.dataStructure.array;
/**
 * 数组高级操作示例
 * 包含多维数组、排序、复制、查找等进阶操作
 */
import java.util.Arrays;

public class ArrayAdvancedExample {
    public static void main(String[] args) {
        // 多维数组 - 实际是数组的数组
        // 内存布局：外层数组存储内层数组的引用
        int[][] matrix = {
            {1, 2, 3},  // 第一行
            {4, 5, 6}   // 第二行
        };
        // 访问元素
        int element = matrix[1][2]; // 访问第二行第三个元素
        System.out.println(element);

        // 遍历二维数组
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("Element at row " + i + ", col " + j + ": " + matrix[i][j]);
            }
        }
        // 数组排序 - 使用快速排序(平均O(nlogn))
        // 注意：对于基本类型使用双轴快排，对象类型使用TimSort
        int[] unsorted = {5, 3, 8, 1};
        Arrays.sort(unsorted);
        System.out.println("排序后的数组: " + Arrays.toString(unsorted));
        
        // 数组复制 - 浅拷贝
        // 陷阱：对于对象数组，只复制引用不复制对象本身
        int[] original = {1, 2, 3};
        int[] copy = Arrays.copyOf(original, original.length);
        System.out.println("复制后的数组: " + Arrays.toString(unsorted));

        // 数组查找 - 必须先排序
        // 时间复杂度：O(logn)
        int index = Arrays.binarySearch(unsorted, 3);
        System.out.println(index);
        
        // 数组比较 - 深度比较每个元素
        // 对于对象数组，调用元素的equals()方法
        boolean equal = Arrays.equals(original, copy);
        System.out.println(equal);

        // 常见错误示例：
        // 1. 数组越界
        // int x = matrix[2][0]; // 抛出ArrayIndexOutOfBoundsException
        // 2. 空指针：
        // int[][] arr = new int[2][]; arr[0][0] = 1; // NullPointerException
    }
}