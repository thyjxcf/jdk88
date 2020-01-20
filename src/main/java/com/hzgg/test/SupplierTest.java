package com.hzgg.test;

import java.util.function.Supplier;

/**
 * Designed By luf
 *
 * @author luf
 * @date 2019/8/8 13:42
 */
public class SupplierTest {

    public static void main(String[] args) {
        Supplier<String> supplier = () -> "hello world";
        System.out.println(supplier.get());
    }
}
