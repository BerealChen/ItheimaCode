package com.itheima.test1;

/**
 * 引用类型 参数传递
 */
public class Demo5Debug {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        System.out.println("调用change方法前:" + arr[1]);
        change(arr);//地址值
//        arr = null;
        System.out.println("调用change方法后:" + arr[1]);
    }
    public static void change(int[] arr) {
        arr[1] = 200;
    }
}