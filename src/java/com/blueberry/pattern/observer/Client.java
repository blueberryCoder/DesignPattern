package com.blueberry.pattern.observer;

/**
 * Created by Administrator on 2016/10/11.
 */
public class Client {

    public static void main(String[] args){
        Subject subject = new Subject();
        subject.addObserver(new Coder("coderA"));
        subject.addObserver(new Coder("coderB"));
        subject.addObserver(new Coder("coderC"));
        subject.publishContent("有文章更新");
    }
}
