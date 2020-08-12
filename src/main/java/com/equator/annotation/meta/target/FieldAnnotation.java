package com.equator.annotation.meta.target;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
public @interface FieldAnnotation {
    String value() default "";
}
