package com.blueberry.pattern.facade;

/**
 * Created by Administrator on 2016/10/8.
 */
public class Client {
    public static void main(String[] args){
        MobilePhone nexus6 = new MobilePhone();

        //拍照
        nexus6.takePicture();
        //视频聊天
        nexus6.videoChat();
    }
}
