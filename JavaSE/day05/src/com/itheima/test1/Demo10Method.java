package com.itheima.test1;

/**
 * @author chenxh
 * DateTime: 2022/10/17 15:51
 * Desc :
 * 方法重载
 * 好处：不用记忆繁杂的方法名称
 * 1.同一个类中
 * 2.法名相同，参数不同的方法（个数不同、类型不同、顺序不同）
 * 3.跟返回值类型无关，跟参数名无关
 */
public class Demo10Method {
    public static void main(String[] args) {

    }
    public static void method(){

    }
    //跟返回值类型无关
    /*public static int method(){
        return i;
    }*/
    //参数个数不同
    public static void method(int i){

    }
    //参数类型不同
    public static void method(double d){

    }
    //顺序重载
    public static void method(int i ,double d){

    }
    public static void method(double d,int i){

    }
    //类型不同才能构成顺序重载
    public static void method(int i1,int i2){

    }
    /*
    //跟参数名无关
    public static void method(int i2,int i1){

    }*/
}
