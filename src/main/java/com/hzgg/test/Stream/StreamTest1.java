package com.hzgg.test.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Designed By luf
 *
 * @author luf
 * @date 2019/8/8 13:45
 */
public class StreamTest1 {
    public static void main(String[] args) {
//        Stream<String> stringStream = Stream.of("hello", "world", "howareyou");
//        String[] arrys = {"hello", "world", "fuck"};
//        Stream<String> stream = Arrays.stream(arrys);
//        List<String> list = Arrays.asList(arrys);
//        Stream<String> stream1 = list.stream();
//        System.out.println("------------");
//        Stream.of(5,6,7).forEach(System.out::println);
//        System.out.println("------------");
//        IntStream.range(3,8).forEach(System.out::println);
//        System.out.println("------------");
//        IntStream.rangeClosed(3,8).forEach(System.out::println);

        System.out.println(IntStream.of(3,5,6).map(value->value*2).reduce(0,Integer::sum));
    }
}
