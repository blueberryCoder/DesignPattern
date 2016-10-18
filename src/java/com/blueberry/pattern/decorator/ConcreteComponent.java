package com.blueberry.pattern.decorator;

/**
 * Created by Administrator on 2016/10/8.
 */
public class ConcreteComponent extends Component {
    @Override
    public void operate() {
        System.out.println("ConcreteComponent.");
    }
}
