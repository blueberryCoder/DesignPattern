package com.blueberry.pattern.singleTon;

/**
 * Created by Administrator on 2016/8/30.
 */
public class SingleTon {
    private static SingleTon instance;

    public static SingleTon getInstance() {
        if (instance == null) {
            instance = new SingleTon();
        }
        return instance;
    }

    protected SingleTon(){

    }
}
