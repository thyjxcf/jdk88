package net.zdsoft.jvm.classloader;

public class MyTest18_1 {

    public static void main(String[] args) throws ClassNotFoundException {
        MyTest16 loader1 = new MyTest16("loader1");
        loader1.setPath("C:\\Users\\11298\\Desktop\\");
        Class<?> clazz = loader1.loadClass("net.zdsoft.jvm.classloader.MyTest1");
        System.out.println("class:" + clazz.hashCode());
        System.out.println("classLoader:" + clazz.getClassLoader());

    }
}
