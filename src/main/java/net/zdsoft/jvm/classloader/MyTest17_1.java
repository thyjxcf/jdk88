package net.zdsoft.jvm.classloader;

/**
 * Designed By luf
 *
 * @author luf
 * @date 2019/8/3 17:48
 */

/**
 * 关于命名空间的说明
 * 子加载器所加载的类能够访问父加载器所加载的类
 * 父加载器所加载的类不能访问子加载器所加载的类
 */
public class MyTest17_1 {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        MyTest16 loader1 = new MyTest16("loader1");
        loader1.setPath("C:\\Users\\user\\Desktop\\");
        Class<?> clazz = loader1.loadClass("net.zdsoft.jvm.classloader.MySample");
        System.out.println("clazz::" + clazz.hashCode());
        //如果注释掉改行 ，并不会实例化MySample对象，即MySample对象不会调用，即MyCat对象不会实例化
        Object object = clazz.newInstance();

    }
}
