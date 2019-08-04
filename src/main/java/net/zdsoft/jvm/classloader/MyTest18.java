package net.zdsoft.jvm.classloader;

public class MyTest18 {

    public static void main(String[] args) {
        System.out.println(System.getProperty("sun.boot.class.path"));
        System.out.println(System.getProperty("java.ext.dirs"));
        System.out.println(System.getProperty("java.class.path"));
//        ;C:\E\ideaProject\jdk8\out\production\classes;
//        会被纳入java.class.path 路径下 就会被系统类加载器加载
    }

}
