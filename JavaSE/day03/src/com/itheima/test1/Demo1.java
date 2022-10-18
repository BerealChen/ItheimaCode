package com.itheima.test1;

import java.util.Scanner;

/**
 * @author chenxh
 * DateTime: 2022/10/14 9:27
 * @Description switch
 */
public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入星期数：");
        int days =sc.nextInt();

        //搭建switch条件分支语句
        switch (days){
            case 1:
                System.out.println("day1");
                break;
            case 2:
                System.out.println("day2");
                break;
            case 3:
                System.out.println("day3");
                break;
            case 4:
                System.out.println("day4");
                break;
            case 5:
                System.out.println("day5");
                break;
            case 6:
                System.out.println("day6");
                break;
            case 7:
                System.out.println("day7");
                break;
            default:
                System.out.println("error");
        }
    }
}
