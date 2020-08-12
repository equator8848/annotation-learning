package com.equator.annotation.meta.target;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
public @interface TypeAnnotation {
    String value() default "";
}
