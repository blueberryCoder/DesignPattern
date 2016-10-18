package com.blueberry.pattern.strategy;

/**
 * Created by Administrator on 2016/10/11.
 */
public class Client {
    public static void main(String[] args){
        PriceCalculator priceCalculator = new PriceCalculator();
        priceCalculator.setStrategy(new BusStrategy());
        int busPrice =priceCalculator.calculatePrice(20);
        priceCalculator.setStrategy(new TaxiStrategy());
        int taxiPrice = priceCalculator.calculatePrice(20);
        priceCalculator.setStrategy(new SubwayStrategy());
        int subwayPrice = priceCalculator.calculatePrice(20);

        System.out.printf("bus:%d ,taxi:%d,subway:%d",busPrice,taxiPrice,subwayPrice);


    }
}
