package com.blueberry.pattern.builder;

/**
 * Created by Administrator on 2016/8/29.
 */
public class ConcreteBuilder extends Builder {

    private String partA ;
    private String partB;
    private String partC;

    @Override
    void buildPartA(String text) {
        this.partA = text;
    }

    @Override
    void buildPartB(String text) {
        this.partB = text;
    }

    @Override
    void buildPartC(String text) {
        this.partC = text;
    }

    @Override
    Product getResult() {
        Product product = new Product();
        product.setPartA(partA);
        product.setPartB(partB);
        product.setPartC(partC);
        return product;
    }
}
