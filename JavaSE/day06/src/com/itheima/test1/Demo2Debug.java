package com.itheima.test1;

/**
 * 求1-5之间的偶数和
 */
public class Demo2Debug {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 0; i < 6; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
