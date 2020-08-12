package com.equator.annotation.meta.target;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.PACKAGE)
public @interface PackageAnnotation {
    String value() default "";
}
