package com.itheima.test2;

import java.util.Scanner;

/**
 * @author chenxh
 * DateTime: 2022/10/12 16:40
 * @Description
 */
public class Demo15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个分数：");
        int score = sc.nextInt();
        if (score >= 90 && score <= 100){
            System.out.println("great");
        }else if (score >= 80){
            System.out.println("nice");
        }else if (score >= 70){
            System.out.println("justsoso");
        }else if (score >= 60){
            System.out.println("try hard");
        }else{
            System.out.println("idiot");
        }
    }
}
