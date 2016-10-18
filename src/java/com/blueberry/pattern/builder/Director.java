package com.blueberry.pattern.builder;

/**
 * Created by Administrator on 2016/8/29.
 */
public class Director {
    private Builder mBuilder;

    public Director(Builder builder){
        this.mBuilder = builder;
    }

    public Product getProduct(){
       return mBuilder.getResult();
    }
}
