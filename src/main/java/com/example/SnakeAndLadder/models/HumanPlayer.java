package com.example.SnakeAndLadder.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;



public class HumanPlayer extends Player {

    private String username;

    public HumanPlayer(Color pieceColor) {
        super(pieceColor);
    }
}
