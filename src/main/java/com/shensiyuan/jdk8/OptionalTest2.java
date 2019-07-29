package com.shensiyuan.jdk8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * Designed By luf
 *
 * @author luf
 * @date 2019/7/17 20:22
 */
public class OptionalTest2 {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("tom");
        Employee employee1 = new Employee();
        employee.setName("peny");

        Company company = new Company();
        company.setName("apple");

        List<Employee> employeeList = Arrays.asList(employee, employee1);
//        company.setEmployeeList(employeeList);

        Optional<Company> optional = Optional.ofNullable(company);

        System.out.println(optional.map(theCompany -> theCompany.getEmployeeList()).orElse(Collections.EMPTY_LIST));

    }

    public void test(Optional optional) {

    }
}
