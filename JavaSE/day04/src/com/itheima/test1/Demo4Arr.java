package com.itheima.test1;

/**
 * @author chenxh
 * DateTime: 2022/10/15 15:12
 * @Description :
 */
public class Demo4Arr {
    public static void main(String[] args) {
        int[] arr = {11,22,33};
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
//        ArrayIndexOutOfBoundsException：索引越界
//        System.out.println(arr[3]);
        arr = null;
//        NullPointerException：空指针异常
        System.out.println(arr[0]);
    }
}
