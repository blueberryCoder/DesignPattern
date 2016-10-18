package com.blueberry.pattern.bridge;

/**
 * Created by Administrator on 2016/10/8.
 */
public abstract class Abstraction {
    private Implementor mImplementor;

    /**
     * 通过实现部分对象的引用构造抽象部分的对象
     *
     * @param implementor 实现部分对象的引用
     */
    public Abstraction(Implementor implementor){
        mImplementor = implementor;
    }

    public void operation(){
        mImplementor.operationImpl();
    }
}
