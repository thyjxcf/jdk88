package net.zdsoft.jvm.classloader;

/**
 * Designed By luf
 *
 * @author luf
 * @date 2019/7/31 11:04
 */

/**
 * 常量在编译阶段会存入到调用这个常量的方法所在类的常量池中
 * 本质上，调用类本没有直接引用到定义常量的类，因此并不会触发
 * 定义常量类的初始化
 *
 * 注意：这里指的是将常量存入到MyTest2的常量池中，之后MyTest2与MyParent2没有任何关系了
 *
 * 助记符
 * ldc 表示将int,float 或是String 类型的常量值从常量池中推送至栈顶
 * bipush 表示将单字节（-128-127）的常量值推送至栈顶
 *
 *  sipush 表示将一个短整型的常量值（-32768 - 32767）推送至栈顶
 *  iconst_1 表示将int类型1推送至栈顶 只有5个 （iconst_1 - iconst_5) ( iconst_m1 - iconst_m5)
 */
public class MyTest2 {

    public static void main(String[] args) {
        //先初始化 ，在打印str值
        System.out.println(MyParent2.i);
    }

}
class MyParent2{
//    public static String str = "hello world";
    //没有牵扯到类的主动使用 ，导致结果只会输出 hello world
    //final 表示一个不能被改变的常量 在编译阶段，这个常量就会被存入到调用这个常量的那个方法所在类的常量池中
    //在编译阶段 会被放在MyTest2的常量池中
    //注记符

    //   Code:
    //       0: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
    //       3: ldc           #4                  // String hello world
    //       5: invokevirtual #5                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
    //       8: return

    public static final String str = "hello world";

    public static final short s=127;

    public static final int i=-1;
    public static final int m=6;
    static{
        System.out.println("MyParent static block");
    }
}
