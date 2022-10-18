package com.itheima.test2;

/**
 * @author chenxh
 * DateTime: 2022/10/18 14:45
 * Desc :
 */
public class Demo3Arr {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3};
        System.out.println(arr);//[I@506e6d5e
        System.out.println(arr[0]);//1

        //int[][] arr1 = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int[][] arr1 = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(arr1);//[[I@96532d6
        System.out.println(arr1[0]);//[I@3796751b
        System.out.println(arr1[1]);//[I@67b64c45
        System.out.println(arr1[2]);//[I@4411d970
        System.out.println(arr1[0][0]);//1
        System.out.println(arr1[1][0]);//4
        System.out.println(arr1[2][2]);//9
    }
}
