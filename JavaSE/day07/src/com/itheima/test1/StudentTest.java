package com.itheima.test1;

/**
 * @author chenxh
 * DateTime: 2022/10/18 17:14
 * Desc :
 */
public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "阿强";
        Student s2 = s1;
        s2.name = "阿珍";
        System.out.println(s1.name + "..." + s2.name);
        s1 = null;
//        System.out.println(s1.name);
        System.out.println(s2.name);
        s2 = null;
    }
}
class Student{
    String name;
    int age;
    public void study(){
        System.out.println("好好学习");
    }
}
