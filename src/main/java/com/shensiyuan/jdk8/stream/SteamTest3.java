package com.shensiyuan.jdk8.stream;

import java.util.stream.IntStream;

/**
 * Designed By luf
 *
 * @author luf
 * @date 2019/7/22 17:59
 */
public class SteamTest3 {

    public static void main(String[] args) {
        System.out.println(IntStream.of(3, 5, 6).map(e -> e * 2).reduce(0, Integer::sum));;
    }
}
