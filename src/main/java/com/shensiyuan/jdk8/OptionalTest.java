package com.shensiyuan.jdk8;

import java.util.Optional;

/**
 * Designed By luf
 *
 * @author luf
 * @date 2019/7/17 20:08
 */
public class OptionalTest {

    public static void main(String[] args) {
        Optional<String> optional = Optional.of("hello");
        if (optional.isPresent()) {
            System.out.println(optional.get());
        }

       optional.ifPresent(item-> System.out.println(item));

        Optional<String> optional2 = Optional.empty();
        System.out.println(optional2.orElse("world"));
    }
}
