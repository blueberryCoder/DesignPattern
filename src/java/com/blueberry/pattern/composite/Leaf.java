package com.blueberry.pattern.composite;

/**
 * Created by Administrator on 2016/10/8.
 */
public class Leaf extends Component {


    public Leaf(String name) {
        super(name);
    }

    @Override
    public void doSomething() {
        System.out.println(name);
    }
}
