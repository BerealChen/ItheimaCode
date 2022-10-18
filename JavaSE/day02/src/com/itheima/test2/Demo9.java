package com.itheima.test2;

/**
 * @author chenxh
 * DateTime: 2022/10/12 15:39
 * @Description
 */
public class Demo9 {
    public static void main(String[] args) {
        int i = 10;
        int j = 20;
        System.out.println(i++ > 10 && ++j < 20);
        System.out.println(i);
        System.out.println(j);

        System.out.println();
        int a = 10;
        int b = 20;
        System.out.println(++a > 10 || ++b > 20);
        System.out.println(a);
        System.out.println(b);
    }
}
