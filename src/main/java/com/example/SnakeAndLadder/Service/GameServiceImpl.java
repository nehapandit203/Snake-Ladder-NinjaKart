package com.example.SnakeAndLadder.Service;

import com.example.SnakeAndLadder.models.Game;
import com.example.SnakeAndLadder.models.Player;
import com.example.SnakeAndLadder.strategy.IBoardMoveStratgy;
import com.example.SnakeAndLadder.strategy.MoveToTail;

import java.util.Queue;
import java.util.Scanner;

public class GameServiceImpl implements IGameService{
    IBoardMoveStratgy moveStrategy = new MoveToTail();
    BoardService boardService = new BoardService();
    @Override
    public Queue<Player> run(Game game) {
        boardService.print(game.getBoard());

        while(game.getPlayerList().size() >1 ) {
            Player currentPlayer = game.getPlayerList().poll();
            System.out.println("Player " + currentPlayer.getColor() + " its your turn !!");
            System.out.println("Press r to roll a dice ...!");

            Scanner sc = new Scanner(System.in);
            char ch = sc.next().charAt(0);
            moveStrategy.makeMove(currentPlayer,game);// TODO:

            if (currentPlayer.getPosition() == game.getBoard().getTotalCells()) {
                System.out.println(currentPlayer.getName() + " won!!!");
                game.getWinnerList().add(currentPlayer);
                break;
            } else
                game.getPlayerList().add(currentPlayer);

        }
        return game.getWinnerList();
    }


}
