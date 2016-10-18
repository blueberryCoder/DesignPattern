package com.blueberry.pattern.decorator;

/**
 * Created by Administrator on 2016/10/8.
 */
public class ConcreteDecoratorA extends Decorator {
    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    public void operate(){
        operateA();
        super.operate();
        operateB();
    }

    private void operateB() {
        System.out.println("ConcreteDecoratorB.operateB");
    }

    private void operateA() {
        System.out.println("ConcreteDecoratorA.operateA");

    }
}
