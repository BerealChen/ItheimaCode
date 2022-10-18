package com.itheima.test1;

import java.util.Scanner;

/**
 * 注意事项:
 * 1.遇到键盘录入 要在console中输入值才能继续执行
 * 2.遇到switch 要点在switch那行 或者 之上
 */
public class Demo8Debug {
    public static void main(String[] args) {
    /*  Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字:");
        int num1 = sc.nextInt();
        System.out.println(num1);

        System.out.println("请输入第二个数字:");
        int num2 = sc.nextInt();
        System.out.println(num2);
*/

        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        lo:
        while (flag) {
            System.out.println("请输入星期数:");
            int day = sc.nextInt();

            //case穿透 就是省略了break之后 穿透到第一个break 或者 程序执行完
            switch (day) {
                case 0:
                    System.out.println("感谢您的使用");
                    flag = false;
                    break lo;
                case 1:
                    System.out.println("星期一 做空腹有氧");
                    break;
                case 2:
                    System.out.println("星期二 做个大保健");
                    break;
                case 3:
                    System.out.println("星期三 进行单打");
                    break;
                case 4:
                    System.out.println("星期四 上班工作");
                    break;
                case 5:
                    System.out.println("星期五 上班工作");
                    break;
                case 6:
                    System.out.println("星期六 上班工作");
                    break;
                case 7:
                    System.out.println("星期日 吃大餐");
                    break;
                default:
                    System.out.println("您的智商有误,请抓紧治疗");

            }
        }
    }
}