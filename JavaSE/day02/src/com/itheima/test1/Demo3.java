package com.itheima.test1;

import java.sql.SQLOutput;

/**
 * @author chenxh
 * DateTime: 2022/10/12 10:51
 * @Description: 强制类型转换：将数据类型大的 强制赋值给 数据类型小的变量
 */
public class Demo3 {
    public static void main(String[] args) {
        double d = 23.3;
        //强制类型转换会造成精度丢失
        int i = (int)d;
        System.out.println(i);
    }

}
