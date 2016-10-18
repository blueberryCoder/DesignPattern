package com.blueberry.pattern.memento;

/**
 * Created by Administrator on 2016/10/11.
 *
 * 备忘录
 */
public class Memento {
    public int mCheckPoint;
    public int mLifeValue;
    public String mWeapon;

    @Override
    public String toString() {
        return "Memento{" +
                "mCheckPoint=" + mCheckPoint +
                ", mLifeValue=" + mLifeValue +
                ", mWeapon='" + mWeapon + '\'' +
                '}';
    }
}
