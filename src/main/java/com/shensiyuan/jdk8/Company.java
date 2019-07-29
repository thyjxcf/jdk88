package com.shensiyuan.jdk8;

import java.util.List;

/**
 * Designed By luf
 *
 * @author luf
 * @date 2019/7/17 20:21
 */
public class Company {

    private String name;

    private List<Employee> employeeList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}
