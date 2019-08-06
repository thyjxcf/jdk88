package net.zdsoft.jvm.classloader;

/**
 * 当前类加载器（current ClassLoader) 用于加载当前类的这个加载器
 * 每个类都会使用自己的类加载器（即加载自身的那个类加载器）来加载其他类（指的是所依赖的类）
 * 如果ClassX引用ClassY,ClassX的加载器就会去加载ClassY(前提是ClassY尚未被加载）
 *
 */
/*
    线程上下文类加载器（Context classLoader)

    线程上下文类加载器是从JDK1.2开始引用的，类Thread中的getContextClassLoader()与 setContextClassLoader(ClassLoader cl);
    分别来获取和设置上下文类加载器
    如果没有通过setContextClassLoader(ClassLoader cl)来设置的话，线程将继承其父线程的类加载器
    Java应用运行时初始线程的上下文类加载器是系统类加载器，在线程中运行的代码可以通过该类加载器来加载类与资源

    线程上下文类加载器的重要性
    SPI(service provider interface)
    父classLoader 可以使用当前线程Thread.currentThread().getCurrentClassLoader()所指定的classLoader来加载类
    这就改变了父classloader不能使用子classloader或者其他没有父子关系的classloader加载的类的情况，即改变了双亲委托模型

    线程上下文类加载器就是当前线程的current classloader
    在双亲模型下，类加载是由下至上的即下层类加载器会委托上层进行加载，但是对于SPI来说有些接口是Java核心库提供的
    而Java核心库是由启动类加载器来加载的，而这些实现却来自不同的jar包（厂商提供），java启动类加载器是不会加载其他来源的
    jar包，这样传统的双亲委托模型就无法满足SPI要求，而通过给当前线程设置上下文类加载器，就可以由设置的上下文类加载器来实现对于接口实现类的
    加载
 */
public class MyTest24 {
    /**
     * 具体的实现由厂商来实现，厂商实现是由应用类加载器来加载。启动类根本找不到
     * connection 是由启动类加载器加载，具体实现是由系统类加载器加载，启动类加载器加载不了
     * JNDI
     * 解决 双亲委托模型 本身的一些缺陷 采用 线程上下文 加载器来解决 。
     * webapp 下  可以部署多个 应用 ，所以有多个加载器 ，自己去加载 才委托上面去加载 。
     * spring webAppClassLoader  类加载器
     * @param args
     */
    public static void main(String[] args) {
        //为啥线程有类加载器 它有什么作用？
        System.out.println(Thread.currentThread().getContextClassLoader());
        System.out.println(Thread.class.getClassLoader());
        //输出肯定都是AppClassLoader
        //输出结果
//        sun.misc.Launcher$AppClassLoader@18b4aac2
//        null
        //Thread位于java.lang 包中由启动类加载器加载 。
    }
}
