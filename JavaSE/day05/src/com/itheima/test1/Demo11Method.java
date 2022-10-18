package com.itheima.test1;

/**
 * @author chenxh
 * DateTime: 2022/10/17 16:14
 * Desc :基本数据类型 方法参数传递
 */
public class Demo11Method {
    public static void main(String[] args) {
        int number = 100;
        System.out.println("调用方法前" + number);//100
        change(number);
        System.out.println("调用方法后" + number);//100
    }

    public static void change(int number) {
        number = 200;
    }
}
