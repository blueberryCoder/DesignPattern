package com.blueberry.pattern.factory_method;

/**
 * Created by Administrator on 2016/8/29.
 */
public class Client {
    public static void main(String[] args){
        Creator creator = new ConcreteCreator();
        creator.showName();
    }
}
