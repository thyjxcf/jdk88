package com.shensiyuan.jdk8.stream2;

/**
 * Designed By luf
 *
 * @author luf
 * @date 2019/9/4 14:57
 */
public class LamdaTest {
    Runnable r1 = () -> System.out.println(this);
    Runnable r2 = new Runnable() {
        @Override
        public void run() {
            System.out.println(this);
        }
    };

    public static void main(String[] args) {
        LamdaTest lamdaTest = new LamdaTest();
        Thread t1 = new Thread(lamdaTest.r1);
        t1.start();
        System.out.println("----------");
        Thread t2 = new Thread(lamdaTest.r2);
        t2.start();

    }
}
