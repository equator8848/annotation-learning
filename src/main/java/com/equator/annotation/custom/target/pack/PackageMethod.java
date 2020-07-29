package com.equator.annotation.custom.target.pack;

public class PackageMethod {
    public void test1() {
        System.out.println("test1");
    }

    public void test2() {
        System.out.println("test2");
    }

    public static void main(String[] args) {
        new PackageMethod().test1();
    }
}
