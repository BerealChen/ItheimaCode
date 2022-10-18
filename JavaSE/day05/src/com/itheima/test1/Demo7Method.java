package com.itheima.test1;

/**
 * @author chenxh
 * DateTime: 2022/10/17 11:25
 * Desc :
 */
public class Demo7Method {
    public static void main(String[] args) {
        //假设前端传来的账号密码为
        int username = 1123;
        int password = 111;
        //前端调用方法并传入输入的账号密码
        System.out.println(isFlag(username,password));
        if (isFlag(username, password)){
            System.out.println("登录成功");
        }else {
            System.out.println("登录失败");
        }
    }
    public static boolean isFlag(int usn,int pwd){
        //与数据库中正确的账号密码进行比较
        return usn == 123 && pwd == 111;
    }
}
