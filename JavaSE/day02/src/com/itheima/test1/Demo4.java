package com.itheima.test1;

/**
 * @author chenxh
 * DateTime: 2022/10/12 10:58
 * @Description: 隐式类型转换细节问题
 */
public class Demo4 {
    public static void main(String[] args) {
        byte b1 = 12;
        byte b2 = 23;
        byte sum = (byte)(b1 + b2);
        //java中的常量优化机制
        /*
        常量参与运算的时候 会让3 + 4进行运算 会判断结果7是否在byte的取值范围之内
        如果在 编译成功
        如果不在 编译报错
         */
        byte sum1 = 3 + 4;
        System.out.println(sum);
        System.out.println(sum1);
    }
}
