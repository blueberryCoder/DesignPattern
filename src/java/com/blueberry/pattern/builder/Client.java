package com.blueberry.pattern.builder;

/**
 * Created by Administrator on 2016/8/29.
 */
public class Client {
    public static void main(String[] args){
        Builder builder = new ConcreteBuilder();
        builder.buildPartA("partA");
        builder.buildPartB("partB");
        builder.buildPartC("partC");

        Director director = new Director(builder);

        System.out.println(director.getProduct());
    }

}
