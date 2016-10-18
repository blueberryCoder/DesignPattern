package com.blueberry.pattern.abstract_factory;

/**
 * Created by Administrator on 2016/8/29.
 */
public class ConcreteFactory2 extends AbstractFactory{
    @Override
    public AbstractProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB2();
    }
}
