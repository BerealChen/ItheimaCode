package com.itheima.test1;

import java.util.Scanner;

/**
 * @author chenxh
 * DateTime: 2022/10/16 10:42
 * @Description :
 */
public class test4 {
    public static void main(String[] args) {
        System.out.println(compare(10,20));
    }
    public static boolean compare(byte a ,byte b) {
        if (a == b){
            return true;
        }else {
            return false;
        }
    }
    public static boolean compare(short a ,short b) {
        if (a == b){
            return true;
        }else {
            return false;
        }
    }
    public static boolean compare(int a ,int b) {
        if (a == b){
            return true;
        }else {
            return false;
        }
    }
    public static boolean compare(long a ,long b) {
        if (a == b){
            return true;
        }else {
            return false;
        }
    }
}
