package com.example.SnakeAndLadder.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ComputerPlayer extends Player{
    private String name;

    public ComputerPlayer(Color pieceColor) {
        super(pieceColor);
    }
}
