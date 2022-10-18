package com.itheima.test1;

/**
 *  基本数据类型 方法参数传递
 */
public class Demo4Debug {
    public static void main(String[] args) {
        int number = 100;
        System.out.println("调用change方法前:" + number);
        change(number);
        System.out.println("调用change方法后:" + number);
    }

    public static void change(int number) {
        number = 200;
    }
}
