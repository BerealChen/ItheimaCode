package com.itheima.test1;

/**
 * @author chenxh
 * DateTime: 2022/10/16 11:07
 * @Description :
 */
public class test5 {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55};
        traversal(arr);
    }
    public static void traversal(int[] arr){
        System.out.print("[");
        for (int i = 0;i < arr.length;i++){
            System.out.print(arr[i]);
            if (i != arr.length - 1){
                System.out.print(",");
            }
        }
        System.out.println("]");
    }
}
