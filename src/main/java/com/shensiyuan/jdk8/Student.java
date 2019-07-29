package com.shensiyuan.jdk8;

/**
 * Designed By luf
 *
 * @author luf
 * @date 2019/7/17 17:58
 */
public class Student {

    private String name ="zhangsan";
    private int age = 12;
    public Student() {
    }
    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
