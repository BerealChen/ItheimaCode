package com.itheima.test1;

import java.util.Random;
import java.util.Scanner;

/**
 * @author chenxh
 * DateTime: 2022/10/16 14:15
 * @Description :
 */

public class Demo {
    public static void main(String[] args) {
        //定义一个字符串来存储数组的元素，方便输出
        String s = "";
        //生成一个数组指向getRan()方法生成的数组的地址
        int[] arr1 = getRan();
        //将随机生成数的数组的各个元素对应赋值给arr
        for (int i = 0; i < arr1.length; i++) {
            s += arr1[i] + " ";
        }
        System.out.println(s);
    }

    //定义一个长度为10的数组，生成10个不重复随机数填入数组
    public static int[] getRan() {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            Random r = new Random();
            arr[i] = r.nextInt(16) + 15;
            int j = 0;
            while (i >= 1 && j < i) {
                if (arr[i] == arr[j]) {
                    i--;
                    break;
                }
                j++;
            }
        }
        return arr;
    }
}