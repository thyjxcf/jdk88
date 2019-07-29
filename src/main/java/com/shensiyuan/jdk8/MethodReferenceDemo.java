package com.shensiyuan.jdk8;

import java.util.Arrays;
import java.util.List;

/**
 * Designed By luf
 *
 * @author luf
 * @date 2019/7/17 20:35
 */
public class MethodReferenceDemo {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "world", "hello world");
        list.forEach(System.out::println);
    }
}
