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

    }
}
