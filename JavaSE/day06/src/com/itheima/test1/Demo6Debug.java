package com.itheima.test1;

import java.util.Random;

/**
 * 生成6个不同的随机数存入到数组中
 */
public class Demo6Debug {
    public static void main(String[] args) {
        int[] arr = new int[6];

        int count = 0;
        Random sc = new Random();
        for (int i = 0; i < 6; i++) {
            int num = sc.nextInt(6) + 1;
            arr[i] = num;
            for (int j = 0; j < i; j++) {
                if (num == arr[j]) {
                    i--;
                    break;
                }

            }
            count++;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
