package com.shensiyuan.jdk8.stream;

import java.util.*;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Designed By luf
 *
 * @author luf
 * @date 2019/7/22 19:35
 */
public class SteamTest4 {

    public static void main(String[] args) {
//        Stream<String> streams = Stream.of("hello", "world", "hello world");

//        String[] stringArray = streams.toArray(length -> new String[length]);
//        String[] stringArray = streams.toArray(String[]::new);
//        String[] stringArray = streams.toArray(String::);

//        Arrays.asList(stringArray).forEach(System.out::println);
//        Stream<String> streams = Stream.of("hello", "world", "hello world");

//        List<String> list = streams.collect(() -> new ArrayList<String>(), (theList, item) -> theList.add(item), (theList1, theList2) -> theList1.addAll(theList2));

//        List<String> list = streams.collect(LinkedList::new,LinkedList::add,LinkedList::addAll);
//        list.stream().forEach(System.out::println);
//
//        Stream<String> streams = Stream.of("hello", "world", "helloworld");
//        List<String> list = streams.collect(Collectors.toCollection(ArrayList::new));
//        list.stream().forEach(System.out::println);

//        Stream<String> streams = Stream.of("hello", "world", "hello world");
//        Set<String> set = streams.collect(Collectors.toCollection(TreeSet::new));
//        set.stream().forEach(System.out::println);


        Stream<String> streams = Stream.of("hello", "world", "hello world");
        String str =streams.collect(Collectors.joining());
        System.out.println(str);


    }
}
