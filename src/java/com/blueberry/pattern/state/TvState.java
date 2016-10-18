package com.blueberry.pattern.state;

/**
 * Created by Administrator on 2016/10/11.
 */
public interface TvState {
    void nextChannel();

    void prevChannel();

    void turnUp();

    void turnDown();

}
