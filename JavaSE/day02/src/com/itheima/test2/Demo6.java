package com.itheima.test2;

/**
 * @author chenxh
 * DateTime: 2022/10/12 15:02
 * @Description
 */
public class Demo6 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        a += b;//30
        System.out.println(a);

        //扩展到运算符包含了强制类型转换
        byte b1 = 10;
        b1 +=5;//byte b1 = (byte)(b + 5);
        System.out.println(b1);
        //byte sum = b1 + 5;
    }
}
