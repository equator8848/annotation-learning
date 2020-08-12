package com.equator.annotation.meta.target;


public class TargetTest {
    @FieldAnnotation("字段")
    private String name;

    // @MethodAnnotation
    @ConstructorAnnotation("构造函数")
    public TargetTest() {

    }

    @MethodAnnotation("方法")
    public void setName(@ParameterAnnotation("参数") String name) {
        this.name = name;
    }

}
