package net.zdsoft.jvm.classloader;

/**
 * Designed By luf
 *
 * @author luf
 * @date 2019/8/3 17:11
 */
public class MySample {

    public MySample() {
        System.out.println("MySample is loading by" + this.getClass().getClassLoader());
        new MyCat();
    }
}
