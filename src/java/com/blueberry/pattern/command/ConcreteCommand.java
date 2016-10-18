package com.blueberry.pattern.command;

/**
 * Created by Administrator on 2016/10/9.
 */
public class ConcreteCommand implements Command {

    private Receiver receiver ;

    public ConcreteCommand(Receiver receiver){
        this.receiver = receiver;
    }
    @Override
    public void execute() {
        receiver.action();
    }
}
