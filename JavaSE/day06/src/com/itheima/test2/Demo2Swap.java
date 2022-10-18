package com.itheima.test2;

/**
 * @author chenxh
 * DateTime: 2022/10/16 18:08
 * Desc :数组倒序
 */
public class Demo2Swap {
    public static void main(String[] args) {
        int[] arr = {19, 28, 37, 46, 50};
        int temp;
        for (int start = 0, end = arr.length - 1; start < end; start++, end--) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
