package com.blueberry.pattern.decorator;

/**
 * Created by Administrator on 2016/10/8.
 */
public class ConcreteDecoratorB extends Decorator {
    public ConcreteDecoratorB(Component component) {
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
        System.out.println("ConcreteDecoratorB.operateA");

    }
}
