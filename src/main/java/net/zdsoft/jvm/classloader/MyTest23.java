package net.zdsoft.jvm.classloader;

/**
 * Designed By luf
 *
 * @author luf
 * @date 2019/8/5 13:58
 */

import sun.misc.Launcher;

/**
 * 在运行期，一个Java类由该类的完全限定名（binary name ,二进制名 ）和用于加载该类的定义类加载器（define loader ) 共同决定的
 * 如果同样名字（即相同限定名）的类是由两个不同的类加载器加载，那么这些类是完全不同的，即使.clas 文件字节码完全一样，并且从相同的位置
 * 加载亦如此。
 *
 * 在oracle的HOtSpot 实现中，系统属性sun.boot.class.path 被修改错了则运行出错，提示如下信息
 * Error occurred during initialization of VM
 * java/lang/noClassDefFoundError
 *
 * //纯java 加载器 它是由谁加载 ？  自定义加载器 是由bootstrap classloader 负责来加载 ，启动类加载器是由c++写的 ，属于JVM
 * 启动类加载其内嵌与JVM当中，由JVM启动 的
 * 内建于JVM中的启动类加载器会加载java.lang.ClassLoader以及其他java平台类，
 * 当JVM启动时，一块特殊的机器码会运行，它会加载扩展类加载器和系统类加器器
 * 这块特殊的机器码叫做启动类加载器（BootStrap）
 *
 * 启动器类加载器并不是java类，而其他加载器都是Java类。
 * 启动类加载器是特定与平台的机器指令，它负责开启整个加载过程
 * 所有类加载器（除了启动类加载器）都被实现为java类，不过总归有一个组件来加载第一个java类加载器，从而让整个加载过程能够顺利的运行下去
 * 加载第一个纯Java类加载器就是启动类加载器的职责
 *
 * 启动类加载器还会加载供JRE正常运行的基本组件，这包括java.util和java.lang包中的类
 */
public class MyTest23 {

    public static void main(String[] args) {
        System.out.println(System.getProperty("sun.boot.class.path"));
        System.out.println(System.getProperty("java.ext.dirs"));
        System.out.println(System.getProperty("java.class.path"));
        System.out.println(ClassLoader.class.getClassLoader());
        //Launcher类是由启动类加载器加载的
        System.out.println(Launcher.class.getClassLoader());

        System.out.println("-----------------");
        System.out.println(System.getProperty(""));

    }
}
