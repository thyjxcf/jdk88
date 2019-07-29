package com.shensiyuan.jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Designed By luf
 *
 * @author luf
 * @date 2019/7/17 17:05
 */
public class PredicateTest2 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        PredicateTest2 test2 = new PredicateTest2();
//        test2.conditionFilter(list,i->i%2==0);
//        test2.conditionFilter(list,i->i%2!=0);
//        test2.conditionFilter(list,i->i>5);
//        test2.conditionFilter(list,i->i<3);
//        test2.conditionFilter(list,i->true);
//        test2.conditionFilter(list,i->false);
        test2.conditionFiler2(list,i->i>5,i->i%2==0);
        boolean flag = test2.isEqual("test3").test("test");
        System.out.println(flag);



    }

    public void conditionFilter(List<Integer> list, Predicate<Integer> predicate) {
        for (Integer integer : list) {
            if (predicate.test(integer)) {
                System.out.println(integer);
            }
        }
    }

    public void conditionFiler2(List<Integer> list, Predicate<Integer> predicate1, Predicate<Integer> predicate2) {
        for (Integer integer : list) {
            if (predicate1.or(predicate2.negate()).test(integer)) {
                System.out.println(integer);

            }
        }
    }

    public Predicate<String> isEqual(Object object) {
        return Predicate.isEqual(object);
    }
}
