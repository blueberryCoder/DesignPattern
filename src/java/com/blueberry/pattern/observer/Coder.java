package com.blueberry.pattern.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Administrator on 2016/10/11.
 */
public class Coder implements Observer {

    private String name;
    public Coder(String name){
        this.name = name;
    }
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Hi, "+name+", 文章更新了 内容： "+arg);
    }
}
