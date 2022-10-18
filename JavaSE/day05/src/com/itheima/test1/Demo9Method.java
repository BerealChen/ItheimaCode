package com.itheima.test1;

/**
 * @author chenxh
 * DateTime: 2022/10/17 15:14
 * Desc :
 */
public class Demo9Method {
    public static void main(String[] args) {
        int[] arr = {11,34,223,66,123};
        System.out.println("最大值为" + getMaxMin(arr)[0] +",最小值为" + getMaxMin(arr)[1]);
    }
    public static int[] getMaxMin(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return new int[]{max,min};
    }
}
