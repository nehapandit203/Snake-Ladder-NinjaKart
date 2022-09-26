package com.example.SnakeAndLadder.strategy;

import com.example.SnakeAndLadder.models.*;

import java.util.Map;

public class MoveToTail implements IBoardMoveStratgy {
    @Override
    public void makeMove(Player currentPlayer, Game game) {
        Board board = game.getBoard();

        Map<Integer, CellEntity> cells = game.getBoard().getCells();

        int currentPos = currentPlayer.getPosition();
        int move = Dice.roll();
        int finalPos = currentPos+move;
        if(finalPos <= game.getDimension()){

            if(cells.containsKey(finalPos)){
                System.out.println(cells.get(finalPos).getSymbol());
                finalPos = cells.get(finalPos).nextLocation();
            }
            System.out.println("Taking you to "+finalPos);
        }
        else{
            System.out.print(" Try Next Turn : Out of Range ");
            finalPos = currentPos;
        }
        currentPlayer.setPosition(finalPos);
    }
}
