package com.blueberry.pattern.visitor;

/**
 * Created by Administrator on 2016/10/17.
 */
public class Client {

    public static void main(String[] args){
        ConcreteElement element = new ConcreteElement(10);
        element.accept(new AddVisitor());
        System.out.println("num:"+element.num);
    }
}
