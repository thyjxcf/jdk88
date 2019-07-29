package com.shensiyuan.jdk8;

/**
 * Designed By luf
 *
 * @author luf
 * @date 2019/7/16 21:31
 */
public class Test2 {

    public void test(MyInterface myInterface) {
        System.out.println(1);
        myInterface.test();
        System.out.println(2);
    }

    public static void main(String[] args) {
        Test2 test2 = new Test2();
        test2.test(new MyInterface() {
            @Override
            public void test() {
                System.out.println("mytest2");
            }
        });
        test2.test(() ->{
            System.out.println("mytest222");
        });
        System.out.println("-------------------");
        MyInterface myInterface = ()->{
            System.out.println("hello");
        };
        System.out.println(myInterface.getClass());
        System.out.println(myInterface.getClass().getSuperclass());

        System.out.println(myInterface.getClass().getInterfaces()[0]);
    }
}
