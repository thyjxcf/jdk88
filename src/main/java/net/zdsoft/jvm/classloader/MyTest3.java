package net.zdsoft.jvm.classloader;

import java.util.UUID;

/**
 * Designed By luf
 *
 * @author luf
 * @date 2019/7/31 14:12
 */

/**
 * 当一个常量的值并非编译期间可以确定的，其值就不会放入到调用类的常量池中
 * 这时在程序运行时，会导致主动使用这个常量所在的类，显然会导致这个类的初始化
 *
 */
public class MyTest3 {

    public static void main(String[] args) {
        //会不会输出 ？
        //会
        System.out.println(MyParent3.str);
    }
}

class MyParent3{
    //编译阶段是不知道值的 都是常量 编译期间 不知道值
    public static final String str = UUID.randomUUID().toString();
    static{
        System.out.println("MyParent3 static block");
    }

}
