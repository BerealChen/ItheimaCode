package com.itheima.test1;

/**
 * @author chenxh
 * DateTime: 2022/10/18 14:33
 * Desc :
 */
public class PhoneTest {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.call();
        p.sendMessage();
        System.out.println(p.brand);
        System.out.println(p.price);
    }
}
class Phone{
    String brand = "SamSung";
    int price = 9998;
    public void call(){
        System.out.println("calling...");
    }
    public void sendMessage(){
        System.out.println("sending...");
    }
}
