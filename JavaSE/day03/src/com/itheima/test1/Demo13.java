package com.itheima.test1;

import java.util.Scanner;

/**
 * @author chenxh
 * DateTime: 2022/10/14 15:46
 * @Description :逢7过
 */
public class Demo13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 1;
        int count = 0;
        if ( num < i) {
            System.out.println("您录入的数字无效，请重新录入。");
        }
        while(i <= num) {
            if (i % 2 == 1){
                count += i;
            }
            i++;
        }
        System.out.println("1~" + num + "之间的奇数和为" + count);
    }
}
