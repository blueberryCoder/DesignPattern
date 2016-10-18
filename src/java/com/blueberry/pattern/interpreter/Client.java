package com.blueberry.pattern.interpreter;

/**
 * Created by Administrator on 2016/10/10.
 */
public class Client {
    public static void main(String[] args) {
        Calculator c = new Calculator("10 + 5 + 10 + 7");
        System.out.println(c.calculate());
    }
}
