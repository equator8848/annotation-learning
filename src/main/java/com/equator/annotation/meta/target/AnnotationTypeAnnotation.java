package com.equator.annotation.meta.target;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.ANNOTATION_TYPE)
public @interface AnnotationTypeAnnotation {
    String value() default "";
}
