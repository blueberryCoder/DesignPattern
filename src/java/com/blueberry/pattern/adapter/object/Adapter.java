package com.blueberry.pattern.adapter.object;

/**
 * Created by Administrator on 2016/10/8.
 */
public class Adapter implements SixVolt{

    Volt220 volt220 ;

    public Adapter( Volt220 adaptee){
        volt220 = adaptee;
    }
    @Override
    public int getVolt6() {
        return 6;
    }

    public int getVolt220(){
       return volt220.getVolt220();
    }
}
