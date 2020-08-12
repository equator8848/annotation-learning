package com.equator.annotation.meta.retention;

import java.lang.reflect.Method;

public class RetentionTest {
    @SourceAnnotation
    private void method1() {
        System.out.println("equator");
    }

    @ClassAnnotation(owner = "equator")
    private void method2() {
        System.out.println("method2");
    }

    @RuntimeAnnotation(owner = "equator")
    private void method3() {
        System.out.println("method3");
    }

    public static void main(String[] args) {
        Method[] methods = RetentionTest.class.getDeclaredMethods();
        for (Method method : methods) {
            String methodName = method.getName();
            switch (methodName) {
                case "method1":
                    System.out.println(methodName);
                    System.out.println(method.getAnnotation(SourceAnnotation.class));
                    break;
                case "method2":
                    System.out.println(methodName);
                    System.out.println(method.getAnnotation(ClassAnnotation.class));
                    break;
                case "method3":
                    System.out.println(methodName);
                    System.out.println(method.getAnnotation(RuntimeAnnotation.class));
                    break;
            }
        }
    }
}
