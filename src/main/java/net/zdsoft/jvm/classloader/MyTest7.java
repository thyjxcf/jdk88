package net.zdsoft.jvm.classloader;

/**
 * Designed By luf
 *
 * @author luf
 * @date 2019/8/1 10:29
 */
public class MyTest7 {

    public static void main(String[] args) throws ClassNotFoundException {

        Class<?> clazz = Class.forName("java.lang.String");
        System.out.println(clazz.getClassLoader());
        // 输出 null
        // 表明是根类加载器加载
        Class<?> clazz2 = Class.forName("net.zdsoft.jvm.classloader.D");
        System.out.println(clazz2.getClassLoader());
        //sun.misc.Launcher$AppClassLoader@18b4aac2 内部类 最终是由系统类加载器加载
        // 加载 工程Classpath路径
    }

}
class D{

}