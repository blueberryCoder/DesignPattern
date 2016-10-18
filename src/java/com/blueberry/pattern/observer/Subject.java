package com.blueberry.pattern.observer;

import java.util.Observable;

/**
 * Created by Administrator on 2016/10/11.
 */
public class Subject extends Observable {

    public void publishContent(String content){
        setChanged();
        notifyObservers(content);
    }
}
