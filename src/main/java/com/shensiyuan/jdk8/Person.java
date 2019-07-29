package com.shensiyuan.jdk8;

/**
 * Designed By luf
 *
 * @author luf
 * @date 2019/7/17 14:39
 */
public class Person {

    public Person(String userName, int age) {
        this.userName = userName;
        this.age = age;
    }

    private String userName;

    private int age;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
