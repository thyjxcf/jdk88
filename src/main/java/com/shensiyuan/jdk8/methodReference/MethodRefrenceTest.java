package com.shensiyuan.jdk8.methodReference;

import java.util.Arrays;
import java.util.List;

/**
 * Designed By luf
 *
 * @author luf
 * @date 2019/7/18 17:06
 */
public class MethodRefrenceTest {

    public static void main(String[] args) {
        Student student = new Student("zhangsan", 33244);
        Student student2 = new Student("szhangsan2", 332);
        Student student3 = new Student("dhangsan3", 144);
        Student student4 = new Student("eahangsan4", 2334);

        List<Student> studentList = Arrays.asList(student, student2, student3, student4);

        studentList.sort((p1,p2)->p1.getScore() - p2.getScore());
//        studentList.sort((p1,p2)->Student.compareStudentByScore(p1,p2));
//        studentList.sort(Student::compareStudentByScore);
//        for (Student student1 : studentList) {
//            System.out.println(student1.getName() + "---" + student1.getScore());
//        }
        StudentComparator comparator = new StudentComparator();

        studentList.sort(comparator::compareStudentByScore);
        studentList.forEach(t -> System.out.println(t.getName() + "  " + t.getScore()));
//        studentList.sort(student::compareStudentByName);
    }
}
