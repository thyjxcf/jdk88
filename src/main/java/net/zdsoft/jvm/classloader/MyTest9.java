package net.zdsoft.jvm.classloader;

/**
 * Designed By luf
 *
 * @author luf
 * @date 2019/8/1 11:43
 */
class Parent{
    static int a = 3;
    static {
        System.out.println("Parent static block");
    }
}
class Child extends Parent{
    static  int b =4;
    static {
        System.out.println("Child static block");
    }
}
public class MyTest9 {

    static {
        System.out.println("MyTest9 static block");
    }

    public static void main(String[] args) {
        //忘了它是main方法 作为启动类 会先初始化 。
        System.out.println(Child.b);
    }
}
