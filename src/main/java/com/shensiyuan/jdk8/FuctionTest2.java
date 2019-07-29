package com.shensiyuan.jdk8;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Designed By luf
 *
 * @author luf
 * @date 2019/7/17 13:52
 */
public class FuctionTest2 {

    public static void main(String[] args) {

        FuctionTest2  functionTest2 = new FuctionTest2();
        //12
        System.out.println(functionTest2.compute(2, value -> value * 3, value -> value * value));
        //36
        System.out.println(functionTest2.compute2(2, value -> value * 3, value -> value * value));

        System.out.println(functionTest2.compute3(1,2,(v1,v2)->v1+v2));

        System.out.println(functionTest2.compute3(3,1,(v1,v2)->v1-v2));

        System.out.println(functionTest2.compute4(4,5,(v1,v2)->v1+v2,v1->v1*v1));
    }

    public int compute(int a, Function<Integer, Integer> function1,Function<Integer,Integer> function2) {
        return function1.compose(function2).apply(a);
    }

    public int compute2(int a, Function<Integer, Integer> function1, Function<Integer, Integer> function2) {
        return function1.andThen(function2).apply(a);
    }

    public int compute3(int a, int b, BiFunction<Integer, Integer, Integer> biFunction) {
        return biFunction.apply(a, b);
    }

    public int compute4(int a, int b, BiFunction<Integer, Integer, Integer> biFunction, Function<Integer, Integer> function) {
        return biFunction.andThen(function).apply(a, b);
    }
}
