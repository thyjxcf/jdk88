package com.hzgg.test;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Designed By luf
 *
 * @author luf
 * @date 2019/8/8 10:31
 */
public class FunctionTest2 {

    public static void main(String[] args) {
        FunctionTest2 functionTest2 = new FunctionTest2();
        System.out.println(functionTest2.compute1(2,a->a*3,a->a*a));
        System.out.println(functionTest2.compute2(2,a->a*3,a->a*a));
        System.out.println("_-----------");
        System.out.println(functionTest2.compute3(3,1,(value1 ,value2)->value1+value2));
        System.out.println(functionTest2.compute3(4,1,(a,b)->a-b));
        System.out.println(functionTest2.compute4(3,1,(a,b)->a*b,a->a+2));

    }

    public int compute1(int a, Function<Integer, Integer> function1, Function<Integer, Integer> function2) {
        return function1.compose(function2).apply(a);
    }

    public int compute2(int a, Function<Integer, Integer> function1, Function<Integer, Integer> function2) {
        return function1.andThen(function2).apply(a);
    }

    public int compute3(int a,int b, BiFunction<Integer, Integer, Integer> biFunction) {
        return biFunction.apply(a, b);
    }

    public int compute4(int a, int b, BiFunction<Integer, Integer, Integer> biFunction, Function<Integer, Integer> function) {
       return biFunction.andThen(function).apply(a,b);
    }
}
