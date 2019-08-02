package net.zdsoft.jvm.classloader;

/**
 * Designed By luf
 *
 * @author luf
 * @date 2019/8/2 14:35
 */
public class MyTest15 {

    public static void main(String[] args) {
        String[] str = new String[4];
        System.out.println(str.getClass().getClassLoader());
        //null 输出是 null 为什么
        MyTest15[] myTest15s = new MyTest15[4];
        System.out.println(myTest15s.getClass().getClassLoader());
        //sun.misc.Launcher$AppClassLoader@18b4aac2 系统类加载器 和 元素类型的加载器一致
        int[] arr = new int[4];
        System.out.println(arr.getClass().getClassLoader());
        //null  原生类型的数组 没有类加载器
    }
}
