package com.itheima.test1;

import java.util.Scanner;

/**
 * @author chenxh
 * DateTime: 2022/10/14 21:28
 * @Description :
 */
public class Demo6Arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int sum = 0;
        for (int i = 0 ;i < arr.length;i++) {
            System.out.println("请输入数字，第" + (i+1) + "个，共5个");
            arr[i] = sc.nextInt();
            sum+= arr[i];
        }
        System.out.println("数组内元素和为" + sum);
    }

}
