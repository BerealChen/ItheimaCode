package com.itheima.test1;

/**
 * @author chenxh
 * DateTime: 2022/10/15 11:16
 * @Description :数组：存储同种数据类型的容器
 */
public class Demo1Arr {
    public static void main(String[] args) {
        int[] arr = new int[3];
        double[] arr1 = new double[3];
        int i = 10;
        System.out.println(i);
        System.out.println(arr);
        System.out.println(arr1);
        //证明应用数据类型有初始值
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        //替换值
        arr[0] = 11;
        arr[1] = 22;
        arr[2] = 33;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

    }
}
