package com.itheima.test2;

/**
 * @author chenxh
 * DateTime: 2022/10/12 11:27
 * @Description: 字符的 + 操作
 * GBK:包含汉字的编码表
 * UTF-8 万国码
 */
public class Demo2 {
    public static void main(String[] args) {
        char c1 = 'a';
        char c2 = 'A';
        char c3 = '0';
        System.out.println(c1 + 1);
        System.out.println(c2 + 1);
        System.out.println(c3 + 1);
        System.out.println(c1 + c2 - c3);
    }
}
