package net.zdsoft.jvm.classloader;

/**
 * jvm参数
 * 每增加一个参数 都是以-XX:+<options> 开头的
 * -XX:+<options>  表示开启options选项
 *  -XX:-<options>   表示关闭options选项
 *  设置堆空间大小
 *  -XX:<option>=<value> 表示将option的值设置为value;
 */
public class MyTest1 {

    public static void main(String[] args) {
//        System.out.println(MyChild1.str);
        //MyParent1 static block
        //hello world  为啥没有打印子类的 静态代码块？
        // 对于静态字段来说，只有直接定义了该字段的类才会被初始化
        //当一个类初始化时，要求其
        // 父类全部初始化完毕
        //并没有主动使用MyChild1  没有对其初始化 就不会输出静态代码块
        //-XX:+TraceClassLoading 用于追踪类的加载信息并打印出来
//        [Loaded net.zdsoft.jvm.classloader.MyParent1 from file:/D:/javaWebIdea/jdk8/out/production/classes/]
//[Loaded net.zdsoft.jvm.classloader.MyChild1 from file:/D:/javaWebIdea/jdk8/out/production/classes/]
//        还是会加载

        System.out.println(MyChild1.str2);
//        MyParent1 static block
//        MyChild1 static block
//                welcome
        //对子类主动使用 ，初始化一个子类的使用 ，也会初始化父类


    }
}

class MyParent1{
    public static String str = "hello world";
    //静态代码块本身在程序初始化阶段就会执行
    static{
        System.out.println("MyParent1 static block");
    }
}
class MyChild1 extends MyParent1{
    public static String str2 = "welcome";
    static {
        System.out.println("MyChild1 static block ");
    }
}