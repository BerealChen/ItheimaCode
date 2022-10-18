package com.itheima.test1;

/**
 * @author chenxh
 * DateTime: 2022/10/14 10:32
 * @Description 水仙花数
 */
public class Demo4 {
    public static void main(String[] args) {
        //定义一个统计变量负责计数
        int count = 0;
        for (int i = 100;i < 1000;i++){
            int a = i % 10;
            int b = i / 10 % 10;
            int c = i / 100;
            if(a * a * a + b * b * b + c * c * c == i){
                System.out.print(i + " ");
                count++;
                if(count % 2 == 0){
                    System.out.println();
                }
            }
        }
    }
}
