package com.itheima.test2;

import java.util.Scanner;

/**
 * @author chenxh
 * DateTime: 2022/10/14 19:00
 * @Description :
 */
public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        int i = 1;
        int sum = 0;
        System.out.println("请输入一个数字：");
        while (flag) {
            int num = sc.nextInt();
            if (num < 1) {
                System.out.println("您输入的数字无效，请重新输入：");
                continue;
            }
            while (i <= num) {
                if (i % 2 == 1) {
                    sum += i;
                }
                i++;
            }
            System.out.println("1~" + num + "之间的奇数和为" + sum);
            flag = false;
        }
    }
}