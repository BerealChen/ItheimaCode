package com.itheima.test2;

/**
 * @author chenxh
 * DateTime: 2022/10/12 15:56
 * @Description
 */
public class Demo11 {
    public static void main(String[] args) {
        int a = 150;
        int b = 210;
        int c = 165;
        int temp = 0;
        temp = a > b ? a : b;
        temp = temp > c ? temp : c;
//        temp = (a > b ? a : b) > c ? (a > b ? a : b) : c;
        System.out.println(temp);
    }
}
