package com.blueberry.pattern.abstract_factory;

/**
 * Created by Administrator on 2016/8/29.
 */
public class ConcreteFactory1 extends AbstractFactory{
    @Override
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}
