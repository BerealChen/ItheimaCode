package com.itheima.test2;

/**
 * @author chenxh
 * DateTime: 2022/10/12 14:42
 * @Description 自增自减
 */
public class Demo5 {
    public static void main(String[] args) {
        int i = 10;
        //单独使用时 两者相同
        //i++;
        //++i;

        int a = 10;
        int b = a++;//先算后加
        //int b = ++a;//先加后算
        System.out.println("b" + b);
        System.out.println("a" + a);

        int c = a++ + ++a;
        System.out.println("c" + c);//24
    }
}
