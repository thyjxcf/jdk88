package net.zdsoft.jvm.classloader;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;

public class MyTest14 {

    public static void main(String[] args) throws IOException {
        //获取上下文加载器

        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        System.out.println(classLoader);
        //sun.misc.Launcher$AppClassLoader@73d16e93
        String resource = "net/zdsoft/jvm/classloader/MyTest13.class";
        Enumeration<URL> urls = classLoader.getResources(resource);
        //这样就可以取到 全路径 。
        while (urls.hasMoreElements()) {
            //在磁盘上全路径 ，输出
            System.out.println(urls.nextElement());
        }
        System.out.println("------");
        Class<?> clazz = String.class;
        System.out.println(clazz.getClassLoader());
    }
}
