package com.itheima.test1;

/**
 * @author chenxh
 * DateTime: 2022/10/14 14:42
 * @Description 三种循环的区别
 * 1.do while不管条件循环语句是否为true，都至少执行一次，先执行后判断
 * for、while只有条件为true，才会执行，先判断后执行
 * 2.定义的初始化变量作用域不同
 * for定义的变量在自己的{}中
 * while和do while定义的变量在main的{}中
 */
public class Demo8 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        System.out.println("---------------");
        int j = 1;
        while (j <= 5) {
            System.out.println(j);
            j++;
        }
        System.out.println("---------------");
        int k = 1;
        do {
            System.out.println(k);
            k++;
        } while (k <= 5);
        System.out.println("---------------");
    }
}
