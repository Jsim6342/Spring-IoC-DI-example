package com.example.demo.runner;

import com.example.demo.game.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SpringGameRunner {

    // @Autowired // 필드 주입
    private Game game;

    // @Autowired // 생성자 주입(생략 가능)
    public SpringGameRunner(Game game) { // @Qualifier("BGame")
        this.game = game;
    }

    public void printPlayLog() {
        System.out.println(game.play());
    }

//    @Autowired // Setter 주입
//    public void setGame(Game game) {
//        this.game = game;
//    }

}
