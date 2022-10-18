package com.itheima.test1;

/**
 * @author chenxh
 * DateTime: 2022/10/14 15:03
 * @Description :for循环的嵌套 双重for循环
 * 外层循环执行一次 内存循环执行全部
 */
public class Demo11{
    public static void main(String[] args) {
        for (int i = 1;i <= 5;i++) {
            System.out.println("i=" + i);
            for (int j = 1;j <= 5;j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        //fori + tab
    }
}
