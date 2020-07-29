package com.equator.annotation.custom.target;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.ANNOTATION_TYPE)
public @interface AnnotationTypeAnnotation {
    String value() default "";
}
