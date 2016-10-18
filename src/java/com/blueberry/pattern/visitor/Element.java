package com.blueberry.pattern.visitor;

/**
 * Created by Administrator on 2016/10/17.
 */
public abstract class Element {
     abstract void accept(Visitor visitor);
}
