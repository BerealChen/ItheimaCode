package com.itheima.test1;

/**
 * @author chenxh
 * DateTime: 2022/10/17 10:36
 * Desc :
 */
public class Demo4Method {
    public static void main(String[] args) {
        //模拟前端传入的三个参数
        int a = 12;
        double b = 12.3;
        double c = 129.0;
        getAvg(a, b, c);
    }

    //定义对应类型的形参去接收
    public static void getAvg(int a, double b, double c) {
        double avg;
        avg = (a + b + c) / 3;
        System.out.println("平均数为：" + avg);
    }
}
