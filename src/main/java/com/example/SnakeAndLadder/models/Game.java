package com.example.SnakeAndLadder.models;

import com.example.SnakeAndLadder.Constants;
import com.example.SnakeAndLadder.strategy.IBoardMove;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Game {
    private  Board board;
    private List<Player> winnerList;
    private List<Player> playerList;
    private int dimension = Constants.BOARD_SIZE;
    private int diceCount =Constants.DICE_COUNT;
    private IBoardMove makeMove;


    //public Game(int dimension,int diceCount){
    public Game(){
        this.board= new Board(dimension);
        this.playerList = new ArrayList<>();
        this.winnerList = new ArrayList<>();
    }

}
