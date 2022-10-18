package com.itheima.test1;

import java.util.Scanner;

/**
 * @author chenxh
 * DateTime: 2022/10/15 20:10
 * @Description :用方法判断奇偶数
 * 带参方法的好处：
 * 让程序更灵活
 */
public class Demo3Method {
    /*public static void main(String[] args) {
        method();
    }

    public static void method() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数");
        int a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println(a + "为偶数");
        } else {
            System.out.println(a + "为奇数");
        }
    }*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数");
        int a = sc.nextInt();
        //调用方法时传入的参数叫做实参
        method(a);
    }
    //                        形参，本质就是一个内存空间用于接受前端传输过来的对应数值
    public static void method(int a) {
        if (a % 2 == 0) {
            System.out.println(a + "为偶数");
        } else {
            System.out.println(a + "为奇数");
        }
    }
}
