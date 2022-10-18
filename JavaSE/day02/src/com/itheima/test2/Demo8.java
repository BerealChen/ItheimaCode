package com.itheima.test2;

import java.sql.SQLOutput;

/**
 * @author chenxh
 * DateTime: 2022/10/12 15:33
 * @Description 逻辑运算符
 */
public class Demo8 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        System.out.println((a > b) & (a > c));//f

        System.out.println((a > b) & (a < c));//f

        System.out.println((a < b) & (a > c));//f

        System.out.println((a < b) & (a < c));//t

        System.out.println((a > b) | (a > c));//f

        System.out.println((a > b) | (a < c));//t

        System.out.println((a < b) | (a > c));//t

        System.out.println((a < b) | (a < c));//t

        System.out.println((a > b));//f
        System.out.println(!(a > b));//t
        System.out.println(!!(a > b));//f
    }
}
