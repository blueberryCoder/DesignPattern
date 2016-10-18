package com.blueberry.pattern.memento;

/**
 * Created by Administrator on 2016/10/11.
 */
public class Caretaker {
    Memento memento;

    public void archive(Memento memento){
        this.memento = memento;
    }

    public Memento getMemento(){
        return memento;
    }
}
