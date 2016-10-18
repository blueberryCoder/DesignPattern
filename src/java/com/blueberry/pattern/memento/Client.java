package com.blueberry.pattern.memento;

/**
 * Created by Administrator on 2016/10/11.
 */
public class Client {

    public static void main(String[] args){
        // 构建游戏对象
        CallOfDuty game = new CallOfDuty();
        game.play();
        Caretaker caretaker = new Caretaker();
        caretaker.archive(game.createMemento());
        game.quit();

        CallOfDuty newGame = new CallOfDuty();
        newGame.restore(caretaker.memento);

    }
}
