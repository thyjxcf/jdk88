package com.shensiyuan.jdk8.stream2;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/**
 * Designed By luf
 *
 * @author luf
 * @date 2019/8/28 14:00
 */
public class ConsumerTest {

    public void test(Consumer<Integer> consumer) {
        consumer.accept(100);
    }

    public static void main(String[] args) {
        ConsumerTest consumerTest = new ConsumerTest();
        Consumer<Integer> consumer = i -> System.out.println(i);
        IntConsumer consumer1 = i -> System.out.println(i);
        System.out.println(consumer instanceof  Consumer);
        System.out.println(consumer1 instanceof  IntConsumer);
        consumerTest.test(consumer);//传递的是 一种对象
        consumerTest.test(consumer::accept);//传递的是一种函数式方式
        consumerTest.test(consumer1::accept);//
//        consumerTest.test(consumer1);
    }
}
