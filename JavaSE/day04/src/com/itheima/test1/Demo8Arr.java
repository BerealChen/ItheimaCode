package com.itheima.test1;

import java.util.Scanner;

/**
 * @author chenxh
 * DateTime: 2022/10/15 9:03
 * @Description :
 */
public class Demo8Arr {
    public static void main(String[] args) {
        int[] arr = {19,28,37,46,50};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字");
        int a = sc.nextInt();
        //假设数字不存在于集合之中
        int index = -1;
        //进行循环比较
        for (int i = 0; i < arr.length; i++) {
            if (a == arr[i]) {
                index = i;
            }
        }
        //进行判断
        if (index == -1) {
            System.out.println("该元素不在数组之中");
        }else {
            //存在返回数组中对应元素的索引
            System.out.println("该元素位于" + index + "索引位置");
        }
        //自己写的方式
        /*for (int i = 0 ;i < arr.length;i++) {
            if (a == arr[i]) {
                System.out.println("索引为" + i);
                break;
            }
            if (i == arr.length - 1 && a != arr[i]){
                System.out.println("-1");
                break;
            }

        }*/
    }
}
