package com.blueberry.pattern.abstract_factory;

/**
 * Created by Administrator on 2016/8/29.
 */
public class Client {
    public static void main(String[] args){
        //获得 "1" 工厂
        AbstractFactory factory = new ConcreteFactory1();
        System.out.println("使用 ConcreteFactory1");
        System.out.println("ProductA: "+factory.createProductA().getClass().getName());
        System.out.println("ProductB: "+factory.createProductB().getClass().getName());
        factory = new ConcreteFactory2();
        System.out.println("使用 ConcreteFactory2");
        System.out.println("ProductA: "+factory.createProductA().getClass().getName());
        System.out.println("ProductB: "+factory.createProductB().getClass().getName());
    }
}
