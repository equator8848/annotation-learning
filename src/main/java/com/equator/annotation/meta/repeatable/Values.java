package com.equator.annotation.meta.repeatable;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * 定义一个容器类，保留策略为RUNTIME
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Values {
    Value[] value();
}
