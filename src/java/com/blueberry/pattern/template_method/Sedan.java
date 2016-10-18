package com.blueberry.pattern.template_method;

/**
 * Created by Administrator on 2016/10/17.
 */
public class Sedan extends Car {
    @Override
    protected void lighter() {
        System.out.println("轿车：点火");
    }

    @Override
    protected void openDoor() {
        System.out.println("轿车: 打开车门");
    }
}
