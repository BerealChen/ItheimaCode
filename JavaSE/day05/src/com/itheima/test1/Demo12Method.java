package com.itheima.test1;

/**
 * @author chenxh
 * DateTime: 2022/10/17 16:19
 * Desc :引用数据类型 方法参数传递
 */
public class Demo12Method {
    public static void main(String[] args) {
        int[] arr = {10,20,30};
        System.out.println("调用方法前" + arr[1]);//20
        change(arr);
        System.out.println("调用方法后" + arr[1]);//200
    }
    public static void change(int[] arr){
        arr[1] = 200;
    }
}
