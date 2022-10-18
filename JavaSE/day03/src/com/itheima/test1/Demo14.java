package com.itheima.test1;

import javax.swing.text.html.CSS;
import java.util.Scanner;

/**
 * @author chenxh
 * DateTime: 2022/10/14 16:00
 * @Description :
 */
public class Demo14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //第一种方式 加标号（给循环起名字，指定跳出）
        /*lo:while (true){
            System.out.println("请输入星期数：");
            int days = sc.nextInt();
            switch (days) {
                case 0:
                    break lo;
                case 1:
                    System.out.println("1");
                    break;
                case 2:
                    System.out.println("2");
                    break;
                case 3:
                    System.out.println("3");
                    break;
                case 4:
                    System.out.println("4");
                    break;
                case 5:
                    System.out.println("5");
                    break;
                case 6:
                    System.out.println("6");
                    break;
                case 7:
                    System.out.println("7");
                    break;
            }
        }*/
        //第二种方式
        boolean flag = true;
        while (flag){
            System.out.println("请输入星期数：");
            int days = sc.nextInt();
            switch (days) {
                case 0:
                    flag = false;
                    break;
                case 1:
                    System.out.println("1");
                    break;
                case 2:
                    System.out.println("2");
                    break;
                case 3:
                    System.out.println("3");
                    break;
                case 4:
                    System.out.println("4");
                    break;
                case 5:
                    System.out.println("5");
                    break;
                case 6:
                    System.out.println("6");
                    break;
                case 7:
                    System.out.println("7");
                    break;
            }
        }
    }
}
