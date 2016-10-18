package com.blueberry.pattern.chain_of_responsibility;

/**
 * Created by Administrator on 2016/10/9.
 */
public class ConcreteHandler2 extends Handler {
    @Override
    public void handleRequest(String condition) {
        if(condition.equals("ConcreteHandler2")){
            System.out.println("ConcreteHandler2 handled");
            return;
        }else{
            successor.handleRequest(condition);
        }
    }
}
