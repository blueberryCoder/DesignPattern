package com.blueberry.pattern.factory_method;

/**
 * Created by Administrator on 2016/8/29.
 */
public abstract class Creator {
    public void showName(){
        System.out.println(getProduct().getClass().getSimpleName());
    }

    /**
     * factory method.
     *
     * @return product
     */
    public abstract Product getProduct();
}
