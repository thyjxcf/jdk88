package com.hzgg.test;

import java.util.function.Function;

/**
 * Designed By luf
 *
 * @author luf
 * @date 2019/8/8 10:06
 */
public class FunctionTest {

    public static void main(String[] args) {
        FunctionTest functionTest = new FunctionTest();

        int a = functionTest.compute(3,(Integer b)->{
            return b * 3;});
        System.out.println(a);
        System.out.println(functionTest.compute(4,c -> c+5 ));

        System.out.println("-------");
        System.out.println(functionTest.convert(4,d->String.valueOf(d)+"helll world"));

    }

    public int compute(int a, Function<Integer, Integer> function) {
        int result = function.apply(a);
        return result;
    }

    public String convert(int c, Function<Integer, String> function) {
        return function.apply(c);
    }
}
