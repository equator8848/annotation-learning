package com.equator.annotation.meta.repeatable;

import java.lang.annotation.Repeatable;

@Repeatable(Values.class)
public @interface Value {
    String value();
}
