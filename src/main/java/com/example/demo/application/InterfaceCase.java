package com.example.demo.application;

import com.example.demo.runner.game.CGame;
import com.example.demo.runner.game.Game;
import com.example.demo.runner.InterfaceGameRunner;

public class InterfaceCase {
    public static void main(String[] args) {
        // interface case
        Game nowGame = new CGame();
        InterfaceGameRunner interfaceGameRunner = new InterfaceGameRunner(nowGame);
        interfaceGameRunner.printPlayLog();
    }
}
