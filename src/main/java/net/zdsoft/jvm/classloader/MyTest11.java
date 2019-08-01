package net.zdsoft.jvm.classloader;

/**
 * Designed By luf
 *
 * @author luf
 * @date 2019/8/1 15:45
 */
class Parent3{
    static  int a = 3;
    static {
        System.out.println("parent3 static block");
    }

    static void doSomething() {
        System.out.println("do something");
    }
}
class Child3 extends Parent3{
    static{
        System.out.println("Child3 static block");
    }
}
public class MyTest11 {

    public static void main(String[] args) {
        //谁拥有这个静态变量，就是谁主动使用 就初始化谁  静态变量定义在谁身上，就是对谁的主动使用。
        System.out.println(Child3.a);
        Child3.doSomething();
    }
}
