package com.itheima.test1;

/**
 * @author chenxh
 * DateTime: 2022/10/12 14:30
 * @Description for循环
 */
public class Demo2 {
    public static void main(String[] args) {
        /*
        循环四要素
        1.开始循环
        2.条件判断
        3.执行循环
        4.循环次数自增，返回②
         */
        for (int i = 1;i <= 5;i++){
            System.out.print(i);
        }
        System.out.println();
        for (int i = 5;i >= 1;i--){
            System.out.print(i);
        }
        System.out.println();
        int sum = 0;
        for (int i = 1;i <= 5;i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
