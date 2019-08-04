package net.zdsoft.jvm.classloader;

/**
 * Designed By luf
 *
 * @author luf
 * @date 2019/8/3 17:09
 */
public class MyCat {

    public MyCat() {
        //加载时这个类对应的class对象 ，
        System.out.println("MyCate is loading by" + this.getClass().getClassLoader());
        //子加载器能看到父类加载的类，父加载器看不到子加载器所加载的类
        System.out.println("from MyCat :" + MySample.class);
    }
}
