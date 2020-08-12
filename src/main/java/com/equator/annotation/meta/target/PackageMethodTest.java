package com.equator.annotation.meta.target;

import com.equator.annotation.meta.target.pack.PackageMethod;

/**
 * package-info.java上的@Deprecated注解并不影响包下类的方法
 */
public class PackageMethodTest {
    public static void main(String[] args) {
        PackageMethod packageMethod = new PackageMethod();
        packageMethod.test1();
    }
}
