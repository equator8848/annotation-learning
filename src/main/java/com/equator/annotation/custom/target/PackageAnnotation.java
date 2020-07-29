package com.equator.annotation.custom.target;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.PACKAGE)
public @interface PackageAnnotation {
    String value() default "";
}
