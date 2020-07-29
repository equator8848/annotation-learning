package com.equator.annotation.custom.target;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
public @interface MethodAnnotation {
    String value() default "";
}
