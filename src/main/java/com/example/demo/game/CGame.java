package com.example.demo.game;

import org.springframework.stereotype.Component;

@Component
public class CGame implements Game {
    @Override
    public String play() {
        return "CGame Playing";
    }
}
