package com.hzgg.test;

import java.util.Comparator;
import java.util.function.BinaryOperator;

/**
 * Designed By luf
 *
 * @author luf
 * @date 2019/8/8 9:32
 */
public class BinaryOperatorTest {
    public static void main(String[] args) {
        BinaryOperator<Integer> binaryOperator  = (a,b)->a+b;
        System.out.println(add(1,3,binaryOperator));
//        这个函数该如何使用尼 ？参数是个comparator ,又是个接口的静态方法 ，该如何调用尼 ？
//        System.out.println(BinaryOperator.minBy((a, b) -> a - b));
        System.out.println(compare(3, 1, (a,b)->a-b));

    }
    public static int add(int a, int b, BinaryOperator<Integer> binaryOperator) {
        return binaryOperator.apply(a, b);
    }

    public static boolean compare(int a, int b, Comparator<Integer> comparator) {
        System.out.println(BinaryOperator.minBy(comparator).apply(a, b));
        return BinaryOperator.minBy(comparator).apply(a, b) >=0;
    }
}
