package com.blueberry.pattern.strategy;

/**
 * Created by Administrator on 2016/10/11.
 */
public class PriceCalculator {
    CalculateStrategy mStrategy ;


    public void setStrategy(CalculateStrategy mStrategy) {
        this.mStrategy = mStrategy;
    }

    public int calculatePrice(int km){
        return mStrategy.calculatePrice(km);
    }
}
