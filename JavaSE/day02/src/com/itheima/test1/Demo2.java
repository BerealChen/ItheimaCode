package com.itheima.test1;

/**
 * @author chenxh
 * DateTime: 2022/10/12 10:32
 * @Description: 隐式类型转换细节问题
 */
public class Demo2 {
    public static void main(String[] args) {
        byte b1 = 12;
        byte b2 = 24;
        short s = 33;
        int i = 44;
        float f = 12.3F;
        long lo = 8L;
        double d = 22.3;
        //整数默认使用int
        //byte short char 参与运算的时候，都先提升为int类型
        int sum = b1 + b2;
        System.out.println(sum);
        double sum1 = b1 + b2 + s + i + f + lo + d;
        System.out.println(sum1);
    }
}
