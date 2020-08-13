package com.equator.annotation.principle;

@People(name = "leo")
public class Equator {
    public static void main(String[] args) {
        People people = Equator.class.getAnnotation(People.class);
        System.out.println(people.name());
    }
}