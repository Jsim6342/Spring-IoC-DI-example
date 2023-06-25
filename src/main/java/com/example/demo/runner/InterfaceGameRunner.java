package com.example.demo.runner;

import com.example.demo.runner.game.Game;

public class InterfaceGameRunner {
    private Game game;

    public InterfaceGameRunner(Game game) {
        this.game = game;
    }

    public void printPlayLog() {
        System.out.println(game.play());
    }
}
