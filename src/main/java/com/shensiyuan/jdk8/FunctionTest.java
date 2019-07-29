package com.shensiyuan.jdk8;

import java.util.function.Function;

/**
 * Designed By luf
 *
 * @author luf
 * @date 2019/7/17 12:47
 */
public class FunctionTest {

    public static void main(String[] args) {
        FunctionTest functionTest = new FunctionTest();

        int a=functionTest.compute(1 ,value -> {return  2*value;});
        System.out.println(a);
        System.out.println(functionTest.compute(2,value->5+value));
        System.out.println(functionTest.compute(3,value->value*value));

        System.out.println("-----------");

        System.out.println(functionTest.convert(5,value->String.valueOf(value) + "helloworld"));

    }

    public int compute(int a, Function<Integer, Integer> function) {
        int result = function.apply(a);
        return result;
    }

    public String convert(int a, Function<Integer, String> function) {
        return function.apply(a);
    }
}
