package com.example.demo.runner;

import com.example.demo.runner.game.AGame;

public class ClassGameRunner {
    private AGame aGame;

    public ClassGameRunner(AGame aGame) {
        this.aGame = aGame;
    }

    public void printPlayLog() {
        System.out.println(aGame.play());
    }
}
