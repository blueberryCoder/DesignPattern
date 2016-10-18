package com.blueberry.pattern.template_method;

/**
 * Created by Administrator on 2016/10/17.
 */
public abstract class Car {

    public void start(){
        openDoor();
        lighter();
    }

    protected abstract void lighter();

    protected abstract void openDoor();
}
