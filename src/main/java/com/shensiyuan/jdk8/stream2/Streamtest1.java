package com.shensiyuan.jdk8.stream2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Designed By luf
 *
 * @author luf
 * @date 2019/7/24 9:28
 */
public class Streamtest1 {

    public static void main(String[] args) {
        Student student1 = new Student("zhangsan", 80);
        Student student2 = new Student("lisi", 90);
        Student student3 = new Student("wangwu", 100);
        Student student4 = new Student("zhaoliu", 90);
        List<Student> list = Arrays.asList(student1, student2, student3, student4);

        List<Student> students = list.stream().collect(Collectors.toList());
        students.forEach(System.out::println);

        System.out.println("-------------");
        System.out.println("count==" + students.stream().collect(Collectors.counting()));
        System.out.println("count ==" + students.stream().count());

        //自动装箱 拆箱 发生性能损耗
        /**
         * 收集器
         * collector 是一个借口 ， counting 返回一个 collector接口 。
         *
         *
         */
//        list.stream().count();
    }
}


