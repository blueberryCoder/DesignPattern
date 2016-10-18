package com.blueberry.pattern.factory_method;

/**
 * Created by Administrator on 2016/8/29.
 */
public class ConcreteCreator extends Creator {
    @Override
    public Product getProduct() {
        return new ConcreteProduct();
    }
}
