package com.equator.annotation.custom.target;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.CONSTRUCTOR)
public @interface ConstructorAnnotation {
    String value() default "";
}
