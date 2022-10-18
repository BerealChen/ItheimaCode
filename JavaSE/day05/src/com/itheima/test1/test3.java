package com.itheima.test1;

/**
 * @author chenxh
 * DateTime: 2022/10/16 10:25
 * @Description :
 */
public class test3 {
    public static void main(String[] args) {
        //在main()方法中调用定义好的方法并使用变量保存
        int result = getMax(1,2);
        System.out.println(result);
        //在main()方法中调用定义好的方法并直接打印结果
        System.out.println(getMax(1,2));
    }
    public static int getMax (int a,int b) {
        if (a > b){
            return a;
        }else {
            return b;
        }
    }
}
