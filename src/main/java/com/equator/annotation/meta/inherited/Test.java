package com.equator.annotation.meta.inherited;

public class Test {
    public static void main(String[] args) {
        Son son = new Son();
        InheritedAnnotation annotation = son.getClass().getAnnotation(InheritedAnnotation.class);
        System.out.println(annotation.value());
    }
}
