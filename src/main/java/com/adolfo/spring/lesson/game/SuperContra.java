package com.adolfo.spring.lesson.game;

public class SuperContra implements GamingConsole {

    @Override
    public void up(){System.out.println("up");}
    @Override
    public void down(){System.out.println("down");}
    @Override
    public void left(){System.out.println("left");}
    @Override
    public void right(){System.out.println("right");}
}
