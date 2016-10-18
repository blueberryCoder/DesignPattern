package com.blueberry.pattern.interpreter;

/**
 * Created by Administrator on 2016/10/10.
 */
public abstract class ArithmeticExpression {
    /**
     * 抽象的解析方法
     * 具体的解析逻辑由具体的子类实现
     *
     * @return 解析到具体的值
     */
    public abstract int interpret();
}
