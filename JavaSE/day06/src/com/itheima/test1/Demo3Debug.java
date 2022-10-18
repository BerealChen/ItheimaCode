package com.itheima.test1;

/**
 * 用Debug 查看执行流程 并指出错误
 */
public class Demo3Debug {
    public static void main(String[] args) {
        int i = 0;
        while (i < 100) {
            if (i % 10 == 9 || i / 10 % 10 == 9) {
                System.out.print(i + " ");
                i++;
                continue;
            }
            i++;
        }
    }
}