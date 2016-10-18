package com.blueberry.pattern.mediator;

/**
 * Created by Administrator on 2016/10/10.
 */
public class ConcreteColleagueB extends Colleague {

    public ConcreteColleagueB(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void action() {
        System.out.println("ColleagueB 将信息递交给中介者处理");
    }
}
