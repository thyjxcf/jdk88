package com.shensiyuan.jdk8.stream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Designed By luf
 *
 * @author luf
 * @date 2019/7/22 17:53
 */
public class SteamTest2 {

    public static void main(String[] args) {
        Stream.of(5,6,7).forEach(System.out::println);
        System.out.println("--------");
        IntStream.range(3,8).forEach(System.out::println);
        System.out.println("--------");
        IntStream.rangeClosed(3,8).forEach(System.out::println);
    }
}
