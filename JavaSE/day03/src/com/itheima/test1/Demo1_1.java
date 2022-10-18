package com.itheima.test1;

import java.util.Scanner;

/**
 * @author chenxh
 * DateTime: 2022/10/12 14:15
 * @Description switch语句的case穿透现象
 */
public class Demo1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入星期数：");
        int day = sc.nextInt();
        switch (day){
            case 1:

            case 2:

            case 3:

            case 4:

            case 5:
                System.out.println("weekday");
                break;
            case 6:

            case 7:
                System.out.println("weekend");
                break;
        }
    }
}
