package net.zdsoft.jvm.classloader;

/**
 * Designed By luf
 *
 * @author luf
 * @date 2019/7/31 20:09
 */
public class Sample {
    public static int a=1;
    static {
        a=2;
    }
    static {
        a=4;
    }
    public static void main(String[] args) {
        System.out.println(a);
    }
}
