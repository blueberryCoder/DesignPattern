package com.blueberry.pattern.command;

/**
 * Created by Administrator on 2016/10/9.
 */
public class Invoker {
    private Command command;

    public Invoker(Command command){
        this.command = command;
    }

    public void action(){
        command.execute();
    }
}
