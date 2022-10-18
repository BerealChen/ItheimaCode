package com.itheima.test1;

import java.util.Scanner;

/**
 * @author chenxh
 * DateTime: 2022/10/17 14:46
 * Desc :
 */
public class Demo8Method {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个数且第一个数要小于第二个数：");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int l = getJiSum(n,m);
        if (l == -1) {
            System.out.println("输入错误");
        } else {
            System.out.println("奇数和为" + l);
        }
    }

    public static int getJiSum(int n, int m) {
        int jiSum = 0;
        //程序健壮性的判断
        if (n >= m) {
            jiSum = -1;
        } else {
            for (int i = n; i <= m; i++) {
                if (i % 2 != 0) {
                    jiSum += i;
                }
            }
        }
        return jiSum;
    }
}