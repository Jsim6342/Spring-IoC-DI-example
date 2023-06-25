package com.example.demo.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class AGame implements Game {
    @Override
    public String play() {
        return "AGame Playing!";
    }
}
