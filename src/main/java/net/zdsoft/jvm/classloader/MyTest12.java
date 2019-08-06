package net.zdsoft.jvm.classloader;

/**
 * Designed By luf
 *
 * @author luf
 * @date 2019/8/1 15:52
 */
class CL{
    static {
        System.out.println("class CL ");
    }
}
public class MyTest12 {
    //调用ClassLoader类的loadClass方法加载一个类，并不是对类的主动使用，不会导致类的初始化。
    public static void main(String[] args) throws ClassNotFoundException {
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        Class<?> clazz = classLoader.loadClass("net.zdsoft.jvm.classloader.CL");

        System.out.println(clazz);
        System.out.println("_------------");
        //反射会导致一个类的初始化
        clazz = Class.forName("net.zdsoft.jvm.classloader.CL");
        System.out.println(clazz);
    }

}
