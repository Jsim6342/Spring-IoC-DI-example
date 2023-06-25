package com.example.demo.application;

import com.example.demo.game.AGame;
import com.example.demo.runner.ClassGameRunner;

public class ClassCase {
    public static void main(String[] args) {
        // class case
        AGame nowGame = new AGame();
        ClassGameRunner classGameRunner = new ClassGameRunner(nowGame);
        classGameRunner.printPlayLog();
    }
}
