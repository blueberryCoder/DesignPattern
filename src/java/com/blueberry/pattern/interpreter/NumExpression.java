package com.blueberry.pattern.interpreter;

/**
 * Created by Administrator on 2016/10/10.
 */
public class NumExpression extends ArithmeticExpression {
    private int num;

    public NumExpression(int num){
        this.num = num;
    }

    @Override
    public int interpret() {
        return num;
    }
}
