package com.shensiyuan.jdk8;

import java.util.function.Predicate;

/**
 * Designed By luf
 *
 * @author luf
 * @date 2019/7/17 16:59
 */
public class PredicateTest {

    public static void main(String[] args) {
        Predicate<String> predicat = p -> p.length() > 5;
        System.out.println(predicat.test("23234234"));
        System.out.println(predicat.test("2342"));
    }
}
