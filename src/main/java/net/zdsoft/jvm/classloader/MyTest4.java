package net.zdsoft.jvm.classloader;

/**
 * Designed By luf
 *
 * @author luf
 * @date 2019/7/31 14:22
 */

/**
 * 对于数组实例来说，其类型是由JVM在运行期动态生成的，表示为[Lnet.zdsoft.jvm.classloader.MyParent4
 * 这种形式，动态生成的类型，其父类型就是Object
 * 对于数组来说，JavaDoc经常说构成数组的元素为component 实际上将数组降低一个维度后的类型
 *
 * anewarray 表示创建一个引用类型（如 类，接口，数组）的数组，并将其引用值压入栈顶
 * newarray 表示创建一个指定的原始类型（如 int ，float,char 等）数组 ，并将其压入栈顶
 *
 */
public class MyTest4 {

    public static void main(String[] args) {
//        MyParent4 myParent4 = new MyParent4();
//        MyParent4 myParent45 = new MyParent4();
        //类只会初始化一次 首次主动使用 会导致类的初始化

        MyParent4[] myParent4s = new MyParent4[4];
        //不会导致类的初始化 ，表示并不是对类的初始化 ，没有在七种情况之一
        System.out.println(myParent4s.getClass());
        System.out.println(myParent4s.getClass().getSuperclass());
        //class [Lnet.zdsoft.jvm.classloader.MyParent4;
        //java虚拟机 在运行期生成出来的 ，
        MyParent4[][] myParent4s1 = new MyParent4[3][2];
        System.out.println(myParent4s1.getClass());
        System.out.println(myParent4s1.getClass().getSuperclass());
        //class [[Lnet.zdsoft.jvm.classloader.MyParent4;
        //[[ 二维数组
        //
        int[] ins = new int[1];
        System.out.println(ins.getClass());
        System.out.println(ins.getClass().getSuperclass());
//        class [I
//        class java.lang.Object

    }
}
class MyParent4{

    static {
        System.out.println("MyParent4 static block");
    }
}
