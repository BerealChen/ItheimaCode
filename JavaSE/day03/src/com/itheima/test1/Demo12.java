package com.itheima.test1;

/**
 * @author chenxh
 * DateTime: 2022/10/14 15:13
 * @Description :
 */
public class Demo12 {
    public static void main(String[] args) {
        for (int i = 0; i < 5 ; i++) {
            System.out.print("* ");
            for (int j = 0; j < 3 ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i < 10 ; i++) {
            for (int j = 1;j <= i ; j++) {

                System.out.print(j + "*" + i + "=" + i * j + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < 20; i++) {
            if (i == 4 || i == 18){
                break;
            }
            System.out.println(i);
        }
        for (int i = 0; i < 20; i++) {
            if (i == 4 || i == 18){
                continue;
            }
            System.out.println(i);
        }
    }
}
