package com.shensiyuan.jdk8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Designed By luf
 *
 * @author luf
 * @date 2019/7/22 17:43
 */
public class StreamTest {

    public static void main(String[] args) {

        Stream<String> stringStream = Stream.of("hello", "world", "hello world");
        String[] arr = {"hello", "world", "penny"};
        Stream<String> streams = Arrays.stream(arr);

        List<String> list = Arrays.asList("hello", "world", "peny");
        Stream<String> streamList = list.stream();


    }
}
