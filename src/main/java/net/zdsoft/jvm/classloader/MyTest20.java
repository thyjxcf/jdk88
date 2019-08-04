package net.zdsoft.jvm.classloader;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 类加载器双亲委托模型的好处
 *  1.可以确保java核心库的类型安全，所有的java应用都至少引用java.lang.Object类，也就是说在运行期，
 *  java.lang.Object会被加载到Java虚拟机中，如果这个加载过程由应用自己的类加载器所完成，那么就会很可能在JVM中
 *  存在多个版本的java.lang.Object类，而且这些类之间还是不兼容的，相互不可见的。（其实正是命名空间发挥作用）
 *  借助于双亲委托机制，java核心类库的中的类的加载工作都是由启动类加载器统一完成，从而确保了java应用所使用的
 *  都是同一版本的java核心类库，它们之间是相互兼容的
 *  2.可以确保java核心类库所提供的类不会被自定义的类替代
 *  3.不同的类加载器可以为相同的名称（binary name)的类创建额外的命名空间，相同名称的类可以并存在Java虚拟机中
 *  只需要用不同的类加载器来加载他们即可，不同的类加载器所加载的类是不兼容的，这相当于在Java虚拟机内部创建了
 *  一个又一个相互隔离的java类空间这类机制在很多框架中得到实际应用。
 */
public class MyTest20 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        MyTest16 loader1 = new MyTest16("loader1");
        MyTest16 loader2 = new MyTest16("loader2");
        loader1.setPath("C:\\\\Users\\\\11298\\\\Desktop\\\\");
        loader2.setPath("C:\\\\Users\\\\11298\\\\Desktop\\\\");
        Class<? > clazz1 = loader1.loadClass("net.zdsoft.jvm.classloader.MyPerson");
        Class<? > clazz2 = loader2.loadClass("net.zdsoft.jvm.classloader.MyPerson");
        System.out.println(clazz1 == clazz2);
        //结果为true 都是由系统类加载器加载 所以为true
        Object object1 = clazz1.newInstance();
        Object object2 = clazz2.newInstance();

        Method method = clazz1.getMethod("setMyPerson", Object.class);
        //setMyPerson 这个方法所对应的对象
        method.invoke(object1, object2);
        //我觉得不会抛异常
//        Exception in thread "main" java.lang.reflect.InvocationTargetException
//        at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
//        at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
//        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
//        at java.lang.reflect.Method.invoke(Method.java:498)
//        at net.zdsoft.jvm.classloader.MyTest20.main(MyTest20.java:22)
//        Caused by: java.lang.ClassCastException: net.zdsoft.jvm.classloader.MyPerson cannot be cast to net.zdsoft.jvm.classloader.MyPerson
//        at net.zdsoft.jvm.classloader.MyPerson.setMyPerson(MyPerson.java:7)
//	... 5 more
    }
}
