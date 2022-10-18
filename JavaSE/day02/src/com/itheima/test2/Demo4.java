package com.itheima.test2;

import java.util.Scanner;

public class Demo4{
	public static void main(String[] args){
		System.out.println("请输入一个三位整数：");
		Scanner sc = new Scanner(System.in);
		int a  = sc.nextInt();
		if(a >= 1000){
			System.out.println("输入错误，输入不能大于或等于1000");
		}else if(a < 100){
			System.out.println("输入错误，输入不能小于100");
		}else{
			int b,c,d;
			b = a % 10;
			c = a / 10 % 10;
			d = a / 100;
			System.out.println("整数" + a + "个位数为：" + b);
			System.out.println("整数" + a + "十位数为：" + c);
			System.out.println("整数" + a + "百位数为：" + d);
		}
	}
}	