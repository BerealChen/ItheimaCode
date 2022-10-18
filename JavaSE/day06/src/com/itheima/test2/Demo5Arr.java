package com.itheima.test2;

/**
 * @author chenxh
 * DateTime: 2022/10/18 15:37
 * Desc :二维数组的遍历
 */
public class Demo5Arr {
    public static void main(String[] args) {
        int sum = 0;
        int[][] arr = {{22,66,44},{77,33,88},{25,45,65},{11,66,99}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
                System.out.print(arr[i][j] + " ");
            }
        }
        System.out.println();
        System.out.println(sum);
    }
}
