package com.blueberry.pattern.visitor;

/**
 * Created by Administrator on 2016/10/17.
 */
public class AddVisitor extends Visitor {
    @Override
    void visit(ConcreteElement e) {
        e.num++;
    }
}
