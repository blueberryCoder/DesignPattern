package com.blueberry.pattern.adapter.object;

/**
 * Created by Administrator on 2016/10/8.
 */
public class Client {
    public static void main(String[] args){
        System.out.println("输出的电压: "+new Adapter(new Volt220()).getVolt6());
    }
}
