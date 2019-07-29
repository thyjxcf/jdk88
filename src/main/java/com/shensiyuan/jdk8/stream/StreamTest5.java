package com.shensiyuan.jdk8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Designed By luf
 *
 * @author luf
 * @date 2019/7/23 11:07
 */
public class StreamTest5 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "world", "helloworld", "test");
        String str =list.stream().map(e -> e.toUpperCase()).collect(Collectors.joining());
        System.out.println(str);
        System.out.println("------------");
        List<Integer> list2 = Arrays.asList(2, 3, 4, 5);
        list2.stream().map(item->item*item).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("------------");

        Stream<List<Integer>> streams = Stream.of(Arrays.asList(1, 3), Arrays.asList(23, 25), Arrays.asList(32, 11));

        streams.flatMap(theList -> theList.stream().map(item -> item * item)).forEach(System.out::println);

    }
}
