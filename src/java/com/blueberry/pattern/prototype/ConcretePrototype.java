package com.blueberry.pattern.prototype;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/8/30.
 */
public class ConcretePrototype implements Cloneable {

    private String name ;
    private ArrayList<String> arrayList = new ArrayList<>();
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<String> arrayList) {
        this.arrayList = arrayList;
    }

    @Override
    protected ConcretePrototype clone() throws CloneNotSupportedException {
        ConcretePrototype clone = (ConcretePrototype)super.clone();
        // arrayList 需要深拷贝
        clone.arrayList = (ArrayList<String>) arrayList.clone();
        return clone;
    }
}
