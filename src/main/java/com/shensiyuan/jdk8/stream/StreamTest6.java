package com.shensiyuan.jdk8.stream;

import java.util.IntSummaryStatistics;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Designed By luf
 *
 * @author luf
 * @date 2019/7/23 15:16
 */
public class StreamTest6 {

    public static void main(String[] args) {

        Stream<String> stream = Stream.generate(UUID.randomUUID()::toString);
        System.out.println(stream.findFirst());
        Stream.iterate(1,item->item+2).limit(6).forEach(System.out::println);
       Integer i= Stream.iterate(1, item -> item + 2).limit(6).filter(item -> item > 2).map(item -> item * 2).skip(2).limit(2).reduce(0, Integer::sum);
        System.out.println("-----------");
        System.out.println(i);
        System.out.println("-----------");
        Stream<Integer> integerStream = Stream.iterate(1, item -> item + 2).limit(6);
//        System.out.println(integerStream.filter(item->item>2).mapToInt(item ->item*2).skip(2).limit(2).sum());
        System.out.println("-----------");
//       integerStream.filter(item->item>2).mapToInt(item ->item*2).skip(2).limit(2).min().ifPresent(System.out::println);
//        IntSummaryStatistics intSummaryStatistics =integerStream.filter(item->item>2).mapToInt(item ->item*2).skip(2).limit(2).summaryStatistics();
//        System.out.println(intSummaryStatistics.getSum());
//        System.out.println(intSummaryStatistics.getMax());
//        System.out.println(intSummaryStatistics.getMin());
//        System.out.println(intSummaryStatistics.getAverage());
//        System.out.println(intSummaryStatistics.getCount());

//        System.out.println(integerStream);
//        System.out.println(integerStream.filter(item->item>2));
//        System.out.println(integerStream.distinct());

//        System.out.println(integerStream);
//
//        Stream<Integer> stream1 = integerStream.filter(item -> item > 2);
//        System.out.println(stream1);
//        Stream<Integer> stream2 = stream1.distinct();
//        System.out.println(stream2);



    }
}
