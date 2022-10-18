package com.itheima.test1;

/**
 * @author chenxh
 * DateTime: 2022/10/15 16:14
 * @Description :求最值
 */
public class Demo7Arr {
    public static void main(String[] args) {
        int[] arr = {12, 45, 98, 73, 60};
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("max=" + max);
        System.out.println("min=" + min);
    }
}
