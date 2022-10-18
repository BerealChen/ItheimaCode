package com.itheima.test2;

/**
 * @author chenxh
 * DateTime: 2022/10/18 11:23
 * Desc :数值交换
 * 需要定义第三方变量临时存储原值
 */
public class Demo1Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("a=" + a);
        System.out.println("b=" + b);
    }
}
