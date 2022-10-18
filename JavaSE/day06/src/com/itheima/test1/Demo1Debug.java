package com.itheima.test1;

/**
 * debug 是代码调试工具 简单来说 用于查看程序的执行流程 帮我们快速定位bug所在 必须掌握
 * 1.什么是断点? 如何加断点? 断点加在哪?
 * 2.如何运行加了断点的程序?
 * 3.看哪里?
 * 4.怎么使用debug调试代码 也就是 怎么帮助我们快速定位bug
 * 5.用完怎么关闭
 */
public class Demo1Debug {
    public static void main(String[] args) {
        int i = 10;
        int j = 20;

        //求和
        int sum = i + j;
        //输出结果
        System.out.println(sum);
    }
}
