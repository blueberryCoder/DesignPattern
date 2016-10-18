package com.blueberry.pattern.state;

/**
 * Created by Administrator on 2016/10/11.
 */
public class TvController implements PowerController{
    TvState mTvState;


    public void setTvState(TvState tvState){
        this.mTvState = tvState;
    }

    @Override
    public void powerOn() {
        setTvState(new PowerOnState());
        System.out.println("开机了");
    }

    @Override
    public void powerOff() {
        setTvState(new PowerOffState());
        System.out.println("关机了");
    }

    public void nextChannel(){
        mTvState.nextChannel();
    }

    public void prevChannel(){
        mTvState.prevChannel();
    }

    public void turnUp(){
        mTvState.turnUp();
    }

    public void turnDown(){
        mTvState.turnDown();
    }
}
