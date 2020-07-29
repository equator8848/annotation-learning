package com.equator.annotation.custom.target;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE_PARAMETER)
public @interface TypeParameterAnnotation {
    String value() default "";
}
