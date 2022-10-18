package com.itheima.test1;

import java.util.Random;
import java.util.Scanner;

/**
 * @author chenxh
 * DateTime: 2022/10/15 19:39
 * @Description :
 */
public class Demo{
    public static void main(String[] args){
        int[] arr = new int[6];
        int jisum = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0;i < arr.length;i++) {
            System.out.println("请输入第"  + (i+1) +"个数字");
            arr[i] = sc.nextInt();
            if(arr[i] % 2 != 0){
                jisum += arr[i];
            }
        }
        System.out.println("统计数组中所有的奇数之和为" + jisum);
        System.out.print("[");
        for (int i = 0;i < arr.length;i++) {
            System.out.print(arr[i]);
            if(i != arr.length - 1){
                System.out.print(",");
            }
        }
        System.out.print("]");
    }
}