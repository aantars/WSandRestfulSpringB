package com.adolfo.spring.lesson.game;

public class SuperContra implements GamingConsole {

    @Override
    public void up(){System.out.println("SC up");}
    @Override
    public void down(){System.out.println("SC down");}
    @Override
    public void left(){System.out.println("SC left");}
    @Override
    public void right(){System.out.println("SC right");}
}
