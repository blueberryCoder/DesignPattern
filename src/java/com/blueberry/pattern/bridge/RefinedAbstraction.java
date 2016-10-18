package com.blueberry.pattern.bridge;

/**
 * Created by Administrator on 2016/10/8.
 */
public class RefinedAbstraction extends Abstraction {

    /**
     * 通过实现部分对象的引用构造抽象部分的对象
     *
     * @param implementor 实现部分对象的引用
     */
    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    public void refinedOperation(){
        //对 Abstraction中的方法进行扩展。

        System.out.println("refinedOperation");
        operation();
    }
}
