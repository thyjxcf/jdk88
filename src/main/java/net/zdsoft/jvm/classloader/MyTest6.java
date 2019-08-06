package net.zdsoft.jvm.classloader;

/**
 * Designed By luf
 *
 * @author luf
 * @date 2019/7/31 17:28
 */
public class MyTest6 {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println("counter1=" + Singleton.counter1);
        System.out.println("counter2=" + Singleton.counter2);
        //类中的静态变量 也会和实例进行同步吗？ 是一个copy 还是一个引用尼 ？
        //静态变量执行也是按照 在类中顺序执行的 难道和构造器也是一个级别的吗 ？
        //初始化 从上刀到下 静态变量按照从上到下顺序执行的 。

    }
}
class Singleton{
    public static int counter1 = 1;
    public static int counter2 = 0;
    public static Singleton singleton = new Singleton();
    //在准备阶段 下面方法没有调用
    private Singleton(){
        counter1++;
        counter2++;
        System.out.println(counter1);
        System.out.println(counter2);
    }
//    public static int counter2 = 0;

    public static Singleton getInstance() {
        return singleton;
    }
}
