package com.itheima.test3;

import java.util.Scanner;

/**
 * @author chenxh
 * DateTime: 2022/10/12 17:57
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        int i1 = 5;
        boolean result = (++i1 > 5) || (i1++ > 4);
        System.out.println(result);
        System.out.println(i1);
    }
}
