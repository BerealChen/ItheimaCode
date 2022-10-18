package com.itheima.test1;

import java.util.Random;
import java.util.Scanner;

/**
 * @author chenxh
 * DateTime: 2022/10/14 21:12
 * @Description :
 */
public class test10 {
    public static void main(String[] args){
        int[] arr = new int[6];
        int max = 0;
        int min = 0;
        int sum = 0;
        int avg = 0;
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i < arr.length;i++) {
            System.out.println("请输入第" + (i + 1) + "个成绩");
            arr[i] = sc.nextInt();
            if(arr[i] < 0 || arr[i] > 100){
                i--;
                System.out.print("输入错误，");
            }else{
                sum += arr[i];
            }
        }
        max = arr[0];
        min = arr[0];
        for(int i = 1;i < arr.length;i++){
            if(max < arr[i]){
                max = arr[i];
            }
            if(min > arr[i]){
                min = arr[i];
            }
        }
        avg = (sum - max - min) / 4;
        System.out.println("平均分为" + avg);
    }
}
