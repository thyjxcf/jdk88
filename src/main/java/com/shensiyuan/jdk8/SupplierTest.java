package com.shensiyuan.jdk8;

import java.util.function.Supplier;

/**
 * Designed By luf
 *
 * @author luf
 * @date 2019/7/17 17:56
 */
public class SupplierTest {

    public static void main(String[] args) {

        Supplier<String> supplier = () -> "hell world";
        System.out.println(supplier.get());


    }
}
