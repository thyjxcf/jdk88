package com.shensiyuan.jdk8;

import java.util.function.Supplier;

/**
 * Designed By luf
 *
 * @author luf
 * @date 2019/7/17 18:00
 */
public class StudentTest {

    public static void main(String[] args) {

        Supplier<Student> supplier = ()->new Student();
        System.out.println(supplier.get());
        System.out.println("--------------");
        Supplier<Student> supplier1 = Student::new;
        System.out.println(supplier1.get().getName());

    }
}
