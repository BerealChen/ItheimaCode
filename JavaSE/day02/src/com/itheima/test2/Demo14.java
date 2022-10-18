package com.itheima.test2;

import java.util.Scanner;

/**
 * @author chenxh
 * DateTime: 2022/10/12 16:14
 * @Description if格式2
 */
public class Demo14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int num = sc.nextInt();
//        if (num % 2 == 0){
//            System.out.println("偶数");
//        }else{
//            System.out.println("奇数");
//        }
        String result = num % 2 == 0 ? "偶数" : "奇数";
        System.out.println(result);
    }
}
