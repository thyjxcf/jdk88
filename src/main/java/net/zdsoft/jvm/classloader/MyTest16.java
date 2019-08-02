package net.zdsoft.jvm.classloader;

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

    public MyTest16( String classLoaderName) {
        super();//将系统类加载器当作该类的父加载器
        this.classLoaderName = classLoaderName;
    }

    public MyTest16(ClassLoader parent, String classLoaderName) {
        super(parent);// 指定父加载器
        this.classLoaderName = classLoaderName;
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        byte[] datas = this.loadClassData(name);
        return this.defineClass(name,datas,0,datas.length);
    }

    private byte[] loadClassData(String classLoaderName) {
        InputStream is = null;
        byte[] datas = null;
        ByteArrayOutputStream baos =  null;

        try {
            this.classLoaderName = this.classLoaderName.replace(".", "/");
            is = new FileInputStream(new File(this.classLoaderName));

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

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        MyTest16 myTest16 = new MyTest16("loader1");
        test(myTest16);
    }
    public static void test(ClassLoader classLoader) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class<?> clazz = classLoader.loadClass("net.zdsoft.jvm.classloader.MyTest1");
        Object object = clazz.newInstance();
        System.out.println(object);


    }
}
