package com.shensiyuan.jdk8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

/**
 * Designed By luf
 *
 * @author luf
 * @date 2019/7/17 14:40
 */
public class PersonTest {

    public static void main(String[] args) {
        Person person1 = new Person("peny", 20);
        Person person2 = new Person("like", 30);
        Person person3 = new Person("tom", 50);

        List<Person> list = Arrays.asList(person1, person2, person3);

        PersonTest test = new PersonTest();
        test.getPersonByUserName("tom",list).forEach(v -> System.out.println(v.getUserName()));

        test.getPersonByAge(25,list).forEach(v-> System.out.println(v.getAge()));
        System.out.println("----------------");
        test.getPersonByAge2(10,list,(a,personList)->personList.stream().filter(item->item.getAge()>a).collect(Collectors.toList())).forEach(item-> System.out.println(item.getAge()));
        System.out.println("-----------------");
        test.getPersonByAge2(30,list,(a,personList)->personList.stream().filter(item->item.getAge()<a).collect(Collectors.toList())).stream().forEach(item-> System.out.println(item.getUserName()));
    }

    public List<Person> getPersonByUserName(String userName, List<Person> list) {

        return list.stream().filter(person -> person.getUserName().equals(userName)).collect(Collectors.toList());
    }

    public List<Person> getPersonByAge(int age, List<Person> persons) {
        BiFunction<Integer,List<Person>,List<Person>> biFunction = (a,list)->
            list.stream().filter(item -> item.getAge() > a).collect(Collectors.toList());
        return biFunction.apply(age, persons);
    }

    public List<Person> getPersonByAge2(int age, List<Person> personList ,BiFunction<Integer,List<Person>,List<Person>> biFunction) {

        return biFunction.apply(age, personList);
    }
}
