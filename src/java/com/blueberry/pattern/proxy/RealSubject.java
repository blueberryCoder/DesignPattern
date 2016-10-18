package com.blueberry.pattern.proxy;

/**
 * Created by Administrator on 2016/10/9.
 */
public class RealSubject extends Subject {
    @Override
    void visit() {
        System.out.println("Real Subject!");
    }
}
