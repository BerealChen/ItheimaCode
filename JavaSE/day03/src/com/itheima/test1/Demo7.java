package com.itheima.test1;

/**
 * @author chenxh
 * DateTime: 2022/10/14 14:37
 * @Description do while循环
 * 不管条件判断语句是否为true 都至少执行一次循环
 */
public class Demo7 {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println(i);
            i++;
        }while (i > 10);
    }
}
