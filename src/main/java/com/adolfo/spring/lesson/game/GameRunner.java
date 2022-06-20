package com.adolfo.spring.lesson.game;

public class GameRunner {

    private GamingConsole game;

    public GameRunner(GamingConsole game) {
        this.game = game;
    }

    public void runGame(){
        game.up();
        game.down();
        game.left();
        game.right();
    }

    public GamingConsole getGame() {
        return game;
    }

    public void setGame(GamingConsole game) {
        this.game = game;
    }
}
