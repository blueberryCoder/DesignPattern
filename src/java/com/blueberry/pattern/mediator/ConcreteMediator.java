package com.blueberry.pattern.mediator;

/**
 * Created by Administrator on 2016/10/10.
 */
public class ConcreteMediator extends Mediator {

    protected ConcreteColleagueA colleagueA;//具体同事A
    protected ConcreteColleagueB colleagueB;//具体同事B

    @Override
    public void method() {
        colleagueA.action();
        colleagueB.action();
    }

    public void setColleagueA(ConcreteColleagueA colleagueA) {
        this.colleagueA = colleagueA;
    }

    public void setColleagueB(ConcreteColleagueB colleagueB) {
        this.colleagueB = colleagueB;
    }
}
