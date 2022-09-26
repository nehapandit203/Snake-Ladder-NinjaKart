package com.example.SnakeAndLadder.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Player {
    private Color color;
    private Boolean canMove;
    private Integer position;
    private String name;

    public Player(Color pieceColor,String name){
        this.color = pieceColor;
        this.name = name;
    }
}
