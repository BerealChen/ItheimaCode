package com.itheima.test1;

import java.util.Random;
import java.util.Scanner;

/**
 * @author chenxh
 * DateTime: 2022/10/12 15:46
 * @Description :猜数字
 */
public class Demo16 {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt(100) + 1;

        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入：");
            int guess = sc.nextInt();
            if (guess > num){
                System.out.println("大");;
            }else if(guess < num){
                System.out.println("小");
            }else{
                System.out.println(guess);
                break;
            }

        }


    }
}
