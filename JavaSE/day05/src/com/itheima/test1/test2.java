package com.itheima.test1;

/**
 * @author chenxh
 * DateTime: 2022/10/16 10:21
 * @Description :
 */
public class test2 {
    public static void main(String[] args) {
        print(5,10);
    }
    public static void print(int n,int m){
        System.out.println(n + "到" + m + "之间所有的奇数为：");
        for (int i = n;i <= m;i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
