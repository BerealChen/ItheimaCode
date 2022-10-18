package com.itheima.test1;

/**
 * @author chenxh
 * DateTime: 2022/10/15 14:52
 * @Description :数组静态初始化
 * 明确数组中具体的存储元素的时候 使用静态
 * 知道数组具体长度 但不知道其中元素 结合键盘录入使用 使用动态
 */
public class Demo3Arr {
    public static void main(String[] args) {
        int[] arr = new int[]{11, 22, 33};
        int[] arr1 = {44,55,66};
        int[] arr2 = arr1;
        arr1 = new int[]{77,88,99};
        System.out.println(arr2[0]);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        arr[0] = 99;
        arr[1] = 100;
        arr[2] = 101;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
    }
}
