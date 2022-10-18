package com.itheima.test1;

/**
 * @author chenxh
 * DateTime: 2022/10/14 10:22
 * @Description 求出1-100之间的奇数和
 */
public class Demo3 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1;i <= 100;i++){
            if(i % 2 == 1){
                sum+= i;
            }
        }
        System.out.println(sum);
    }
}
