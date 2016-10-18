package com.blueberry.pattern.composite;

/**
 * Created by Administrator on 2016/10/8.
 */
public  abstract class Component {
    protected String name; //节点名
    public Component(String name){
        this.name = name;
    }

    public abstract void doSomething();
}
