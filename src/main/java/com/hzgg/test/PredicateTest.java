package com.hzgg.test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Designed By luf
 *
 * @author luf
 * @date 2019/8/8 11:19
 */
public class PredicateTest {

    public static void main(String[] args) {
        Predicate<String> predicate = item->item.length()>5;
        System.out.println(predicate.test("234241342"));
        System.out.println(predicate.test("wer"));

        System.out.println("------------------");
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        PredicateTest predicateTest = new PredicateTest();
//        predicateTest.conditionFilter(list,i->i%2==0);
//        predicateTest.conditionFilter(list,i->i%2!=0);
//        predicateTest.conditionFilter(list,i->i>5);
//        predicateTest.conditionFilter(list,i->i<3);
//        predicateTest.conditionFilter(list,i->true);
//        predicateTest.conditionFilter(list,i->false);


    }

    public void conditionFilter(List<Integer> list, Predicate<Integer> predicat) {
        for (Integer integer : list) {
            if (predicat.test(integer)) {
                System.out.println(integer);
            }
        }
    }

}
