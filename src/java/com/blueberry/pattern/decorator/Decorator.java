package com.blueberry.pattern.decorator;

/**
 * Created by Administrator on 2016/10/8.
 */
public class Decorator extends Component {

    private Component component;

    public Decorator( Component component){
        this.component = component;
    }
    @Override
    public void operate() {
        this.component.operate();
    }
}
