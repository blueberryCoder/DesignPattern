package com.blueberry.pattern.iterator;

/**
 * Created by Administrator on 2016/10/10.
 */
public class Client {
    public static void main(String[] args){
       Aggregate<String> a = new ConcreteAggregate<>();
        a.add("Aige");
        a.add("Studio\n");
        a.add("SM");
        a.add("Brother");
        Iterator<String> i = a.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
