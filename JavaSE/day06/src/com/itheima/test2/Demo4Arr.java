package com.itheima.test2;

import java.sql.SQLOutput;

/**
 * @author chenxh
 * DateTime: 2022/10/18 15:01
 * Desc :二维数组细节问题
 */
public class Demo4Arr {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];

        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};
        int[] arr3 = {7,8,9};
        int[] arr4 = {7,8,9,10};

        arr[0] = arr1;
        arr[1] = arr2;
        arr[2] = arr4;

        System.out.println(arr[0][0]);//1
        System.out.println(arr[1][1]);//5
        System.out.println(arr[2][2]);//9
        System.out.println(arr[2][3]);//10
    }
}
