package net.zdsoft.jvm.classloader;

import com.sun.deploy.util.StringUtils;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Designed By luf
 *
 * @author luf
 * @date 2019/8/2 15:19
 */
public class MyTest16 extends ClassLoader {

    private String classLoaderName;
    public static final String fileExtention = ".class";
    private String path;

    public void setPath(String path) {
        this.path = path;
    }

    public MyTest16(String classLoaderName) {
        super();//将系统类加载器当作该类的父加载器
        this.classLoaderName = classLoaderName;
    }

    public MyTest16(ClassLoader parent, String classLoaderName) {
        super(parent);// 指定父加载器
        this.classLoaderName = classLoaderName;
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        System.out.println("findClass invoked " + name);
        System.out.println("class loader name : " + name);
        // 没有加载 ，是系统类加载器加载的
        byte[] datas = this.loadClassData(name);
        return this.defineClass(name,datas,0,datas.length);
    }

    private byte[] loadClassData(String className) {
        InputStream is = null;
        byte[] datas = null;
        ByteArrayOutputStream baos =  null;

        try {
//            this.classLoaderName = this.classLoaderName.replace(".", "/");
            className = className.replace(".", "\\\\");

            String fileName = this.path + className + fileExtention;

            is = new FileInputStream(new File(fileName));

            baos = new ByteArrayOutputStream();
            int ch =0;
            while (-1 != (ch = is.read())) {
                baos.write(ch);
            }

            datas = baos.toByteArray();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return datas;

    }

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException, InterruptedException {
        MyTest16 myTest16 = new MyTest16("loader1");
//        test(myTest16);
        //不指定 就会从 当前路径加载
//        myTest16.setPath("D:/javaWebIdea/dk8/out/production/classes/");
        myTest16.setPath("C:\\Users\\user\\Desktop\\");

        Class<?> clazz = myTest16.loadClass("net.zdsoft.jvm.classloader.MyTest1");
        System.out.println("class:" + clazz.hashCode());
        Object object = clazz.newInstance();
        System.out.println(object);
        System.out.println(clazz.getClassLoader());
        //意味有 MyTest16来加载 其实不是 。是App  为什么  系统类加载 classPath 恰好有这个程序 ，就加载 了
//
//        System.out.println("-------------");
////        MyTest16 loader2 = new MyTest16("loader2");
//        MyTest16 loader2 = new MyTest16(myTest16,"loader2");
//        Class<?> clazz2 = loader2.loadClass("net.zdsoft.jvm.classloader.MyTest1");
//        System.out.println("class:" + clazz2.hashCode());
//        System.out.println(clazz2);
//        Object object2 = clazz.newInstance();
//        System.out.println(object2);
//        System.out.println(clazz2.getClassLoader());
//        //都是系统类加载test1 在ClassPath 加载到ClassPath 就直接返回了 所以class 对象一样
//
//        System.out.println("-------------");
////        MyTest16 loader2 = new MyTest16("loader2");
//        MyTest16 loader3 = new MyTest16(myTest16,"loader3");
//        Class<?> clazz3 = loader3.loadClass("net.zdsoft.jvm.classloader.MyTest1");
//        System.out.println("class:" + clazz3.hashCode());
//        Object object3= clazz.newInstance();
//        System.out.println(object3);
//        System.out.println(clazz3.getClassLoader());

        myTest16 = null;
        clazz = null;
        object = null;
        System.gc();
//        Thread.sleep(30000);
//        myTest16 = new MyTest16("loader2");
//
//        Class<?> clazz3 = myTest16.loadClass("net.zdsoft.jvm.classloader.MyTest1");
//        System.out.println("class:" + clazz3.hashCode());
//        Object object3= clazz3.newInstance();
//        System.out.println(object3);
//        System.out.println(clazz3.getClassLoader());
    }
    public static void test(ClassLoader classLoader) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class<?> clazz = classLoader.loadClass("net.zdsoft.jvm.classloader.MyTest1");
        Object object = clazz.newInstance();
        System.out.println(object);
        System.out.println(clazz.getClassLoader());


    }
}
