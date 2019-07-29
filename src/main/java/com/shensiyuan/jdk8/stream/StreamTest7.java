package com.shensiyuan.jdk8.stream;

import java.util.Arrays;
import java.util.List;

/**
 * Designed By luf
 *
 * @author luf
 * @date 2019/7/23 17:23
 */
public class StreamTest7 {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("hello", "world", "helloworld");
//        list.stream().map(item->item.substring(0,1).toUpperCase()+item.substring(1)).forEach(System.out::println);
        list.stream().map(item->{
            String result =item.substring(0,1).toUpperCase()+item.substring(1);
            System.out.println("test");
        return result;
        }).forEach(System.out::println);

    }
}
