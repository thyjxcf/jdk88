package net.zdsoft.jvm.classloader;

public class MyTest13 {

    public static void main(String[] args) {
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        System.out.println(classLoader);

        while (null != classLoader) {
            classLoader = classLoader.getParent();
            System.out.println(classLoader);
        }
        //系统类加载器 ， 是Launcher 内部类

    }
}
