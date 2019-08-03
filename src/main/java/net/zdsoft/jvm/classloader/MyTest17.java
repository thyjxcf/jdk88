package net.zdsoft.jvm.classloader;

/**
 * Designed By luf
 *
 * @author luf
 * @date 2019/8/3 17:13
 */
public class MyTest17  {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        MyTest16 loader1 = new MyTest16("loader1");
        Class<?> clazz = loader1.loadClass("net.zdsoft.jvm.classloader.MySample");
        System.out.println("clazz::" + clazz.hashCode());
        //如果注释掉改行 ，并不会实例化MySample对象，即MySample对象不会调用，即MyCat对象不会实例化
//        Object object = clazz.newInstance();

    }
}
