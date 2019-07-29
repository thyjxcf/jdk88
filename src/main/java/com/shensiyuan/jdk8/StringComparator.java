package com.shensiyuan.jdk8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Designed By luf
 *
 * @author luf
 * @date 2019/7/17 11:29
 */
public class StringComparator {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("zhangsan", "lisi", "wangwu");

//        list.sort(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o2.compareTo(o1);
//            }
//        });
//        System.out.println(list);
//        Collections.sort(list,(String o1,String o2)->{
//           return o2.compareTo(o1);
//        });
        //去掉参数类型 它也可以通过 类型推断 得到参数 return 去掉也行 。
            Collections.sort(list,(o1,o2) ->o2.compareTo(o1));
        System.out.println(list);

    }
}
