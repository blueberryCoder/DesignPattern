package com.blueberry.pattern.visitor;

/**
 * Created by Administrator on 2016/10/17.
 */
public class ConcreteElement extends Element {

    int num;

    public ConcreteElement(int num) {
        this.num = num;
    }

    @Override
    void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
