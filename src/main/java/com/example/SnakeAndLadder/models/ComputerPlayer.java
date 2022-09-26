package com.example.SnakeAndLadder.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ComputerPlayer extends Player{

    public ComputerPlayer(Color pieceColor,String name) {
        super(pieceColor,name);
    }
}
