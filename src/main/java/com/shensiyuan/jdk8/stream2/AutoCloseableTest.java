package com.shensiyuan.jdk8.stream2;

/**
 * Designed By luf
 *
 * @author luf
 * @date 2019/7/29 17:24
 */
public class AutoCloseableTest implements AutoCloseable {

    public void doSomething() {
        System.out.println("dosomething invoked");

    }

    public static void main(String[] args) {

        try (AutoCloseableTest autoCloseableTest = new AutoCloseableTest()) {

            autoCloseableTest.doSomething();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void close() throws Exception {
        System.out.println("close invoked ");
    }
}
