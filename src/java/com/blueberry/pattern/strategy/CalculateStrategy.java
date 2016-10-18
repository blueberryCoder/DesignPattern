package com.blueberry.pattern.strategy;

/**
 * Created by Administrator on 2016/10/11.
 */
public interface CalculateStrategy {

    /**
     * 按距离计算价格
     *
     * @param km 公里
     * @return 返回价格
     */
    int calculatePrice(int km);
}
