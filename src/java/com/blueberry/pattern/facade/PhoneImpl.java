package com.blueberry.pattern.facade;

/**
 * Created by Administrator on 2016/10/8.
 */
public class PhoneImpl implements Phone {
    @Override
    public void dail() {
        System.out.println("打电话");
    }

    @Override
    public void hangup() {
        System.out.println("挂断");
    }
}
