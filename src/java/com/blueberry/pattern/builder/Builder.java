package com.blueberry.pattern.builder;

/**
 * Created by Administrator on 2016/8/29.
 */
public abstract class Builder {
    abstract void buildPartA(String text);
    abstract void buildPartB(String text);
    abstract void buildPartC(String text);
    abstract Product getResult();
}
