package net.zdsoft.jvm.classloader;

/**
 * Designed By luf
 *
 * @author luf
 * @date 2019/8/6 9:26
 */
public class MyTest25 implements Runnable {
    private Thread thread;

    public MyTest25() {
        this.thread = new Thread(this);
        this.thread.start();
    }

    @Override
    public void run() {
        //获取上下文类加载器
        ClassLoader classLoader = this.thread.getContextClassLoader();
        this.thread.setContextClassLoader(classLoader);
        System.out.println("Class : " + classLoader.getClass());
        System.out.println("Parent : " + classLoader.getParent().getClass());

        //输出结果 为   和我猜的 一样 。。。
//
//        Class : class sun.misc.Launcher$AppClassLoader
//        Parent : class sun.misc.Launcher$ExtClassLoader

    }

    public static void main(String[] args) {
        new MyTest25();
    }
}
