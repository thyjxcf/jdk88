package com.shensiyuan.jdk8;

import java.util.Comparator;
import java.util.function.BinaryOperator;

/**
 * Designed By luf
 *
 * @author luf
 * @date 2019/7/17 19:30
 */
public class BinaryOperatorTest {

    public static void main(String[] args) {
        BinaryOperator<Integer> binaryOperator = (a,b)->a+b;

        BinaryOperatorTest test = new BinaryOperatorTest();
        System.out.println(test.add(3, 4 , binaryOperator));;

        System.out.println(test.compare(1,3,(a,b)->a-b));
    }

    public Integer add(int a, int b, BinaryOperator<Integer> binaryOperator) {
        return binaryOperator.apply(a, b);
    }

    public boolean compare(int a, int b, Comparator<Integer> comparator) {
//        binaryOperator.apply()
        return BinaryOperator.minBy(comparator).apply(a,b) >= 0;
    }
}
