package com.itheima.test1;

import java.util.Random;

/**
 * @author chenxh
 * DateTime: 2022/10/14 16:22
 * @Description :Random随机数
 */
public class Demo15 {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt(10) + 1;
        System.out.println(num);
        //[15,50) [a,b)->nextInt(b-a+1) + a;
        int num1 = r.nextInt(36) + 15;
        System.out.println(num1);
    }
}
