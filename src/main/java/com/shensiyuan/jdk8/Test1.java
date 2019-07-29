package com.shensiyuan.jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Designed By luf
 *
 * @author luf
 * @date 2019/7/16 20:35
 */
public class Test1 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
//        for (int i = 0; i < list.size(); i++) {
//            System.out.print(list.get(i) + "   ");
//        }
//        System.out.println("---------------");
//        for (Integer l : list) {
//            System.out.print( l + "  ");
//
//        }
//        System.out.println("---------------");
//        list.forEach(new Consumer<Integer>() {
//            @Override
//            public void accept(Integer integer) {
//                System.out.println(integer);
//            }
//        });
//        System.out.println("-----------");
//        list.forEach((Integer i)->{
//            System.out.println("woefefe" + i);
//        });
        System.out.println("-----------");
        list.forEach(System.out::println);
    }
}
