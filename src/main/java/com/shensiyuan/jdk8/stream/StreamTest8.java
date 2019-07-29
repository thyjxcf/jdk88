package com.shensiyuan.jdk8.stream;

import java.util.stream.IntStream;

/**
 * Designed By luf
 *
 * @author luf
 * @date 2019/7/23 17:37
 */
public class StreamTest8 {

    public static void main(String[] args) {
        //相当于创建一个无限流 distinct 不知道前面 与lambda密不可分的
//        IntStream.iterate(1,i->(i+1)%2).distinct().limit(6).forEach(System.out::println);
        IntStream.iterate(1,i->(i+1)%2).limit(6).distinct().forEach(System.out::println);
    }
}
