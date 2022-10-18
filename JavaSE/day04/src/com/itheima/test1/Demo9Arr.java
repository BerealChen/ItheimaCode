package com.itheima.test1;

import java.util.Scanner;

/**
 * @author chenxh
 * DateTime: 2022/10/15 16:56
 * @Description :
 */
public class Demo9Arr {
    public static void main(String[] args) {
        //动态初始化一个数组
        int[] arr = new int[6];

        //键盘录入
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int min = 0;
        //定义一个统计变量
        int sum = 0;
        double avg = 0;
        //寻欢存入分值
        for (int i = 0;i < arr.length;i++) {
            System.out.println("请输入分数");
            arr[i] = sc.nextInt();
            //判断分值是否在0-100之间
            if (arr[i] < 0 || arr[i] > 100){
                i--;
                System.out.print("输入错误，");
            }else {
                sum += arr[i];
            }
        }
        max = arr[0];
        min = arr[0];
        //求最值
        for (int i = 1;i < arr.length;i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        avg = (sum - max - min) * 1.0 / 4;
        System.out.println("最高分为" + max);
        System.out.println("最低分为" + min);
        System.out.println("总分为" + sum);
        System.out.println("最后得分为" + avg);
    }
}
