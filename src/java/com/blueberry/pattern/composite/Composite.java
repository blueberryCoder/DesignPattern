package com.blueberry.pattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/10/8.
 */
public class Composite extends Component {
    /**
     * 存储节点的容器
     */
    private List<Component> components = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void doSomething() {
        System.out.println(name);

        if(null!=components){
            for(Component c: components){
                c.doSomething();
            }
        }
    }

    public void addChild(Component child){
        components.add(child);
    }

    public void removeChild(Component child){
        components.remove(child);
    }

    public Component getChildren(int index){
        return components.get(index);
    }
}
