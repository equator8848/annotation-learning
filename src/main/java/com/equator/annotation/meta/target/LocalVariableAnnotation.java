package com.equator.annotation.meta.target;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.LOCAL_VARIABLE)
public @interface LocalVariableAnnotation {
    String value() default "";
}
