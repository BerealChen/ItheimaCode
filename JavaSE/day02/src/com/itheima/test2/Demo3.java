package com.itheima.test2;

/**
 * @author chenxh
 * DateTime: 2022/10/12 11:37
 * @Description: 任何与字符串直接相连，那么这个时候 + 是字符串的连接符
 */
public class Demo3 {
    public static void main(String[] args) {
        //任意类型与字符串直接相连，结果都是字符串
        System.out.println("AAA" + 666);//AAA666
        System.out.println(1 + 99 +"AAA" + 666);//100AAA666
        System.out.println(1 + (99 +"AAA") + 666);//199AAA666
    }
}
