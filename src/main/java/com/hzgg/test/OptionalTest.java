package com.hzgg.test;

import com.shensiyuan.jdk8.Company;
import com.shensiyuan.jdk8.Employee;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * Designed By luf
 *
 * @author luf
 * @date 2019/8/8 10:59
 */
public class OptionalTest {

    public static void main(String[] args) {
        Optional<String> optionalS = Optional.of("hello");
        if (optionalS.isPresent()) {
            System.out.println(optionalS.get());
        }
        optionalS.ifPresent(item-> System.out.println(item));
        optionalS.ifPresent(System.out::println);

        Optional<String> optiona2 = Optional.empty();
        System.out.println(optiona2.orElse("world"));
        System.out.println("-------------");
        Employee employee1 = new Employee();
        employee1.setName("tom");
        Employee employee2 = new Employee();
        employee2.setName("peny");
        Company company = new Company();
        company.setName("alibaba");
        List<Employee> employeeList = Arrays.asList(employee1, employee2);
        company.setEmployeeList(employeeList);

        Optional<Company> optionalCompany = Optional.ofNullable(company);
        System.out.println(optionalCompany.map(item->item.getEmployeeList()).orElse(Collections.EMPTY_LIST));
    }
}
