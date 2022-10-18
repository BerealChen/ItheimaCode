package com.itheima.test1;

import org.junit.jupiter.api.Test;

import java.util.Random;
import java.util.Scanner;

/**
 * @author chenxh
 * DateTime: 2022/10/17 19:18
 * Desc :
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
        Random r = new Random();
        int[] arr = new int[10];
        int num;
        for (int i = 0; i < arr.length; i++) {
            num = r.nextInt(15) + 1;
            arr[i] = num;
            //和数组内之前生成的随机数元素进行比较，如果重复就重新生成
            for (int j = 0; j < i; j++) {
                if (arr[j] == num) {
                    i--;
                }
            }
        }
        return arr;
    }
}