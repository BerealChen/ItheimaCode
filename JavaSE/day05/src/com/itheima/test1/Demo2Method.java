package com.itheima.test1;

/**
 * @author chenxh
 * DateTime: 2022/10/17 9:43
 * Desc :
 * 方法的定义细节：
 *  方法与方法之间是平级关系，不能嵌套
 *  方法不调用不执行
 *  方法调用前在方法区，调用后在栈内存中
 *  方法执行完弹出栈内存
 *
 */
public class Demo2Method {
    public static void main(String[] args) {
        eat();
    }
    public static void eat(){
        study();
        System.out.println("eat");
    }
    public static void study(){
        System.out.println("study");
    }
}
