package CaseStudy.tictactoe.controllers;

import CaseStudy.tictactoe.models.Game;

public class GameController {
    //Starts a new game
    public Game startGame(int dimension, List<Players> players) {
        return Game.getBuilder()
                .setDimension()
                .build();
    }
}
