package com.itheima.test1;

import java.util.Random;

/**
 * debug综合案例
 * 产生5个不同的随机数 存放在长度为5的数组中
 *
 */
public class Demo7Debug {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr = method(arr);
        System.out.println("随机产生5个不同随机数" + ",放在长度为5的数组里,得到的数组是:");
        System.out.print(printArr(arr));
    }

    public static int[] method(int[] arr) {
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            boolean flag = true;
            int num = r.nextInt(6);
            for (int j = 0; j < i; j++) {
                if (arr[j] == num) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                arr[i] = num;
            }else {
                i--;
            }
        }
        return arr;
    }

    public  static String printArr(int[] arr){
        String s = "[";
        for(int i = 0;i < arr.length;i++){
            if (i != arr.length-1) {
                s += arr[i] + ",";
            }else {
                s += arr[i] + "]";
            }
        }
        return s;
    }
}