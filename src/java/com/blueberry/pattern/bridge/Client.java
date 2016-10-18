package com.blueberry.pattern.bridge;

/**
 * Created by Administrator on 2016/10/8.
 */
public class Client {

    public static void main(String[] args){
        Abstraction abstraction = new RefinedAbstraction(new ConcreteImplementorA());
        abstraction.operation();
    }
}
