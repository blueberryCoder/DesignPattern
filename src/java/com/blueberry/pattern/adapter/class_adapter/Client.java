package com.blueberry.pattern.adapter.class_adapter;

/**
 * Created by Administrator on 2016/10/8.
 */
public class Client {
    public static void main(String[] args){
        Adapter adapter = new Adapter();
        System.out.println("输出电压: "+adapter.getVolt6());
    }
}
