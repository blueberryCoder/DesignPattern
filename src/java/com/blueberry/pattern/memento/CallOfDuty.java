package com.blueberry.pattern.memento;

/**
 * Created by Administrator on 2016/10/11.
 * <p>
 * 模拟Originator角色
 */
public class CallOfDuty {
    private int mCheckpoint = 1;
    private int mLifeValue = 100;
    private String mWeapon = "沙漠之鹰";

    public void play() {
        System.out.println("玩游戏: " + String.format("第%d关", mCheckpoint) + "奋战杀敌中");
        mLifeValue -= 10;
        System.out.println("进度升级啦");
        mCheckpoint++;
        System.out.println("到达 " + String.format("第%d关", mCheckpoint));
    }

    public void quit() {
        System.out.println("-----------------");
        System.out.println("退出前游戏属性: " + this.toString());
        System.out.println("退出游戏");
        System.out.println("-----------------");

    }

    public Memento createMemento() {
        Memento memento = new Memento();
        memento.mCheckPoint = this.mCheckpoint;
        memento.mLifeValue = this.mLifeValue;
        memento.mWeapon = this.mWeapon;
        return memento;
    }

    public void restore(Memento memento){
        this.mCheckpoint =memento.mCheckPoint;
        this.mLifeValue = memento.mLifeValue;
        this.mWeapon = memento.mWeapon;

        System.out.println("恢复后的游戏属性: "+this.toString());
    }

    @Override
    public String toString() {
        return "CallOfDuty{" +
                "mCheckpoint=" + mCheckpoint +
                ", mLifeValue=" + mLifeValue +
                ", mWeapon='" + mWeapon + '\'' +
                '}';
    }
}
