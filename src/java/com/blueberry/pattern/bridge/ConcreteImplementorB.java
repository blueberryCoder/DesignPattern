package com.blueberry.pattern.bridge;

/**
 * Created by Administrator on 2016/10/8.
 */
public class ConcreteImplementorB implements Implementor {
    @Override
    public void operationImpl() {
        System.out.println("ConcreteImplementorB");
    }
}
