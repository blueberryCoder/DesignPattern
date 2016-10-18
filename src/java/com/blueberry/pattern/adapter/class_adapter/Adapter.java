package com.blueberry.pattern.adapter.class_adapter;

/**
 * Created by Administrator on 2016/10/8.
 */
public class Adapter extends Volt220 implements SixVolt {
    @Override
    public int getVolt6() {
        return 6;
    }
}
