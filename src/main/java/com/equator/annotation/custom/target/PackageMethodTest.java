package com.equator.annotation.custom.target;

import com.equator.annotation.custom.target.pack.PackageMethod;

/**
 * package-info.java上的@Deprecated注解并不影响包下类的方法
 */
public class PackageMethodTest {
    public static void main(String[] args) {
        PackageMethod packageMethod = new PackageMethod();
        packageMethod.test1();
    }
}
