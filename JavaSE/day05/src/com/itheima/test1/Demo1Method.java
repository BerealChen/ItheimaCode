package com.itheima.test1;

import java.util.Scanner;

/**
 * @author chenxh
 * DateTime: 2022/10/17 9:28
 * Desc :方法是具有独立功能的代码块
 */
public class Demo1Method {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入1-5之间的星期数");
            int days = sc.nextInt();
            if (days >= 1 && days <= 5) {
                if (days == 1) {
                    method();
                }
                if (days == 2) {
                    method();
                }
                if (days == 3) {
                    method();
                }
                if (days == 4) {
                    method();
                }
                if (days == 5) {
                    method();
                }
            } else {
                System.out.println("-1");
                break;
            }
        }
    }

    public static void method() {
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");
    }
}