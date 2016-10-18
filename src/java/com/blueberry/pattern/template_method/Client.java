package com.blueberry.pattern.template_method;

/**
 * Created by Administrator on 2016/10/17.
 */
public class Client {
    public static void main(String[] args){
        Car car  = new Sedan();
        car.start();
    }
}
