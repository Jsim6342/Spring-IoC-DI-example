package com.example.demo.runner.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier
public class BGame implements Game {
    @Override
    public String play() {
        return "BGame Playing";
    }
}
