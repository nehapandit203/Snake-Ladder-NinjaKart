package com.example.SnakeAndLadder.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Player {
    private Color color;
    private Boolean canMove;

    public Player(Color pieceColor){
        this.color = pieceColor;
    }
}
