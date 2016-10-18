package com.blueberry.pattern.strategy;

/**
 * Created by Administrator on 2016/10/11.
 */
public class TaxiStrategy implements CalculateStrategy {
    @Override
    public int calculatePrice(int km) {
        return km*2;
    }
}
