package com.equator.annotation.meta.target;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.PARAMETER)
public @interface ParameterAnnotation {
    String value() default "";
}
