package net.zdsoft.jvm.classloader;

import java.util.Random;

/**
 * Designed By luf
 *
 * @author luf
 * @date 2019/8/1 11:22
 */
class FinalTest{
//    public static final int x = 3;
    public static final int x = new Random().nextInt(4);
    //  3: getstatic     #3                  // Field net/zdsoft/jvm/classloader/FinalTest.x:I
    //输出
    static {
        System.out.println("FinalTest static block");
    }
}
public class MyTest8 {

    public static void main(String[] args) {
        //将3 和 FinalTest.x 替换了 在编译阶段
        System.out.println(FinalTest.x);

    }
}
