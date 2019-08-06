package net.zdsoft.jvm.classloader;

import java.sql.Driver;
import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * Designed By luf
 *
 * @author luf
 * @date 2019/8/6 9:37
 */
/*
    线程上下文类加载一般使用模式 （获取-使用-还原）

    ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
    try{
        Thread.currentThread().setContextClassLoader(targetTccl);
        myMythod();
    }finally{
        Thread.currentThread.setContextClassLoader(classLoader);
    }
   myMythod()里面调用了  Thread.currentThread().getContextClassLoader(); 获取当前线程的上下文类加载器做某些事情
   如果一个类由类加载器A加载，那么这个类的依赖类也是由相同的类加载器来加载（如果该依赖类之前没有被加载过的话）
   ContextClassLoader的作用就是为了破坏java类的类加载委托机制。

    当高层提供了统一的接口让底层去实现，同时又要在高层加载（或实例化）底层类的时候，就必须要通过线程上下文类加载器来帮助高层的classLoader
    找到并加载该类


   Question 1.直接用系统类加载器加载即可 ，为啥非要用启动类加载器加载 ？
 */
/*
    如果不做任何设置，java线程上下文类加载器就是系统类加载器。在SPI的接口中会使用线程上下文类加载器来加载SPI的实现类，。
    在很多框架 中
    ThreadLocal 只能被 当前线程 访问 。每个线程 都有一个副本 ，那空间换时间 。

 */
public class MyTest26 {

    public static void main(String[] args) {
//        Thread.currentThread().setContextClassLoader(MyTest26.class.getClassLoader().getParent());
        ServiceLoader<Driver> loader = ServiceLoader.load(Driver.class);
        Iterator<Driver> iterator = loader.iterator();
        while (iterator.hasNext()) {
            Driver driver = iterator.next();
            System.out.println("driver:" + driver.getClass() +",loader :" + driver.getClass().getClassLoader());
        }

        System.out.println("当前线程上下文类加载器："  + Thread.currentThread().getContextClassLoader());
        System.out.println("ServiceLoader的类加载器 ： " + ServiceLoader.class.getClassLoader());

//        driver:class com.mysql.jdbc.Driver,loader :sun.misc.Launcher$AppClassLoader@18b4aac2
//        driver:class com.mysql.fabric.jdbc.FabricMySQLDriver,loader :sun.misc.Launcher$AppClassLoader@18b4aac2
//        当前线程上下文类加载器：sun.misc.Launcher$AppClassLoader@18b4aac2
//        ServiceLoader的类加载器 ： null
        //为啥结果是这个 Driver.class 不是由 启动类加载器加载 吗 ？为啥返回的 是实现类 MySql的驱动

    }
}


