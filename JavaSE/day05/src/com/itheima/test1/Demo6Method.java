package com.itheima.test1;

/**
 * @author chenxh
 * DateTime: 2022/10/17 11:18
 * Desc :带返回值的方法定义
 */
public class Demo6Method {
    public static void main(String[] args) {
        //统计第一季度总收入
        int sum = getSum(10, 11, 12);
        System.out.println(sum);
        //平均值的处理
        double avg = sum * 1.0 / 3;
        System.out.println(avg);
    }
    public static int getSum(int month1,int month2,int month3) {

        return month1 + month2 + month3;//求第一季度总收入并返回
        //return方法弹出栈内存，后续代码无法被执行
        //int i = 1;
    }
    public static void method(){
        //void表示无返回值，return只作方法结束标记
        return;
    }
}

