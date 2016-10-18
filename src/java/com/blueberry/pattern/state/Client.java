package com.blueberry.pattern.state;

/**
 * Created by Administrator on 2016/10/11.
 */
public class Client {
    public static void main(String[] args){
        TvController tvController = new TvController();
        // 设计开机状态
        tvController.powerOn();
        // 下一个频道
        tvController.nextChannel();

        //调高音量
        tvController.turnUp();
        tvController.powerOff();

        // 调节音量，此时不会生效
        tvController.turnUp();
    }
}
