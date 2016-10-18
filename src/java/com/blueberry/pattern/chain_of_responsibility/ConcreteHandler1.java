package com.blueberry.pattern.chain_of_responsibility;

/**
 * Created by Administrator on 2016/10/9.
 */
public class ConcreteHandler1 extends Handler {
    @Override
    public void handleRequest(String condition) {
        if(condition.equals("ConcreteHandler1")){
            System.out.println("ConcreteHandler1 handled");
            return;
        }else{
            successor.handleRequest(condition);
        }
    }
}
