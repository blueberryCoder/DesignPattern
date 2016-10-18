package com.blueberry.pattern.prototype;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/8/30.
 */
public class Client {
    public static void main(String[] args) {
        ConcretePrototype prototype = new ConcretePrototype();
        prototype.setName("prototype");
        ArrayList arrayList = new ArrayList();
        arrayList.add("hello");
        prototype.setArrayList(new ArrayList<>());
        try {
            ConcretePrototype clone = prototype.clone();
            System.out.println("clone.name= " + clone.getName());
            System.out.println("prototype.arrayList== clone.arrayList : " + (prototype.getArrayList() ==
                    clone.getArrayList()));
            System.out.println("prototype.arrayList.equal(clone.arrayList): "+(
                    prototype.getArrayList().equals(clone.getArrayList())
                    ));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
