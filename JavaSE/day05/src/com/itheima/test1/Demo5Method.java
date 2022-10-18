package com.itheima.test1;

/**
 * @author chenxh
 * DateTime: 2022/10/16 11:29
 * Desc :
 */
public class Demo5Method {
    public static void main(String[] args) {
        int[] arr = {11, 34, 223, 22, 66, 123};
        int[] arr1 = {111, 34, 223, 212, 36, 123};
        int[] arr2 = {12, 346, 423, 22, 66, 23};
        System.out.println("数组中最大值为" + getMax(arr));
        System.out.println("数组中最小值为" + getMin(arr));
        System.out.println("数组中最大值为" + getMax(arr1));
        System.out.println("数组中最小值为" + getMin(arr1));
        System.out.println("数组中最大值为" + getMax(arr2));
        System.out.println("数组中最小值为" + getMin(arr2));
    }

    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
}
