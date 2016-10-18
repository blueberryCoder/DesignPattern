package com.blueberry.pattern.state;

/**
 * Created by Administrator on 2016/10/11.
 */
public class PowerOnState implements TvState {
    @Override
    public void nextChannel() {
        System.out.println("下一频道");
    }

    @Override
    public void prevChannel() {
        System.out.println("上一频道");
    }

    @Override
    public void turnUp() {
        System.out.println("调节音量");
    }

    @Override
    public void turnDown() {
        System.out.println("调低音量");
    }
}
