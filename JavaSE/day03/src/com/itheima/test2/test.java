package com.itheima.test2;

/**
 * @author chenxh
 * DateTime: 2022/10/14 16:18
 * @Description :爱心
 */
public class test {
    public static void main(String[] args) {
        int n = 5;
        int m = 10;
        for (int i = 1; i <= n; i++) {
            while (i % 2 == 1) {
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(' ');
                }
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print('*');
                }
                for (int j = 1; j <= 2 * n - 1 - 2 * (i - 1); j++) {
                    System.out.print(' ');
                }
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print('*');
                }
                System.out.println();
                break;
            }
        }
        for (int i = 1; i <= m; i++) {
            while (i % 2 == 1) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(' ');
                }
                for (int j = 1; j <= 2 * m - 1 - 2 * i; j++) {
                    System.out.print('*');
                }
                System.out.println();
                break;
            }
        }
    }
}
