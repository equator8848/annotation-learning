package com.equator.annotation.lombok;

public class LombokTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("equator");
        student.setAge(21);
        System.out.println(student.getName());
    }
}
