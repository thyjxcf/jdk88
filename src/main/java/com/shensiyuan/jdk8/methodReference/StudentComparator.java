package com.shensiyuan.jdk8.methodReference;

/**
 * Designed By luf
 *
 * @author luf
 * @date 2019/7/18 17:30
 */
public class StudentComparator {


    public int compareStudentByScore(Student student1, Student student2) {
        return student1.getScore()-student2.getScore();
    }

    public int compareStudentByName(Student student1, Student student2) {
        return student1.getName().compareToIgnoreCase(student2.getName());
    }
}
