package com.blueberry.pattern.proxy;

/**
 * Created by Administrator on 2016/10/9.
 */
public class ProxySubject extends Subject {

    private RealSubject mRealSubject;

    public ProxySubject(RealSubject realSubject){
        mRealSubject = realSubject;
    }
    @Override
    void visit() {
        System.out.println("ProxySubject.visit");
        mRealSubject.visit();
    }
}
