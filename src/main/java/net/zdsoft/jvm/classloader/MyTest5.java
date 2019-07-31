package net.zdsoft.jvm.classloader;

/**
 * Designed By luf
 *
 * @author luf
 * @date 2019/7/31 17:06
 */

import java.util.Random;

/**
 * 当一个接口在初始化时，并不要求其父接口都完成了初始化
 * 只有在真正使用到父接口时候（如父接口中所定义的常量时）不会初始化
 *
 */
public class MyTest5 {

    public static void main(String[] args) {
        //对它的主动使用，会导致父类的使用
        // 接口里面的变量 都是 public static final 默认的
        //为啥把 MyChild5.class ，MyParent5.class 文件删了 还可以输出

        System.out.println(MyChild5.thread);
//        new C();
//        new C();
    }
}
interface MyGrandPa{
    public static Thread thread1 = new Thread(){
        {
            System.out.println("MyGrandPa 2invoked");
        }
    };
}
interface MyParent5 extends MyGrandPa{
    //    public static int a = new Random().nextInt(3);
//    public static int a = 6;
    public static Thread thread = new Thread(){
        {
            System.out.println("MyParent5 invoked");
        }
    };
}

//interface MyChild5 extends MyParent5{
//    public static int b = new Random().nextInt(3);
//}
class MyChild5 implements MyParent5{
    public static int b = 5;
}
class C{
    static {
        System.out.println("hello");
    }

    public C() {
        System.out.println("C");
    }

}