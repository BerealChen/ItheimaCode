package com.itheima.test3;

import java.util.Scanner;

/**
 * @author chenxh
 * DateTime: 2022/10/12 18:20
 * @Description
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入工龄：");
        int year = sc.nextInt();
        if(year >= 15 || year < 0){
            System.out.println("输入的数据有误");
        }else {
            System.out.println("请输入当前工资：");
            int salary = sc.nextInt();
            int oldSalary = 0;
            int increase = 0;
            if (year >= 10 && year < 15) {
                oldSalary = salary;
                increase = 5000;
                salary += increase;
            } else if (year >= 5) {
                oldSalary = salary;
                increase = 1000;
                salary += increase;
            } else if (year >= 1) {
                oldSalary = salary;
                increase = 500;
                salary += increase;
            } else if (year >= 0) {
                oldSalary = salary;
                increase = 200;
                salary += increase;
            }
            System.out.println("您目前工作了" + year + "年，基本工资为" + oldSalary + "元，应涨工资" + increase + "元，涨后工资" + salary + "元");
        }
    }
}
