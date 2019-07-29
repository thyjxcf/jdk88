package com.shensiyuan.jdk8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * Designed By luf
 *
 * @author luf
 * @date 2019/7/17 10:35
 */
public class Test3 {

    public static void main(String[] args) {

//        TheInterface theInterface = ()->{};
//        System.out.println(theInterface.getClass().getInterfaces()[0]);
//        TheInterface2 theInterface2 =()->{};
//        System.out.println(theInterface2.getClass().getInterfaces()[0]);
//        //从上下文能够得到 lambda 找到目标特定的抽象方法。
//
//        new Thread(()->{
//            System.out.println("hello");
//        }).start();
//
//        List<String> list = Arrays.asList("hello", "world", "how are you");
//        list.forEach(item->{
//            item.toUpperCase();
//        });
//        //diamand
//        List<String> list2 = new ArrayList<String>();
//        list.forEach(item->{
//            item.toUpperCase();
//            list2.add(item.toUpperCase());
//        });
//        list2.forEach(item->{
//            System.out.println(item);
//        });
//        System.out.println("-------------");
//        //lambda 表达式
//        list.stream().map(item-> item.toUpperCase()).forEach(item-> System.out.println(item));
//        System.out.println("-------------");
//        //方法引用 :: 对方法
//        list.stream().map(String::toUpperCase).forEach(System.out::println);
        //构造方法引用
//        ArrayList::new;
        // lambda 表达式第一个参数 就是 调用toUpperCase 的对象
        Function<String,String> function = String::toUpperCase;
        System.out.println(function.getClass().getInterfaces()[0]);


    }
}
@FunctionalInterface
interface TheInterface{
    void myMethod();
}
@FunctionalInterface
interface TheInterface2{
    void myMethod2();
}