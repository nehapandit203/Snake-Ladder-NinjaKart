package com.example.SnakeAndLadder.controller;

import com.example.SnakeAndLadder.Service.IGameService;
import com.example.SnakeAndLadder.models.Game;
import com.example.SnakeAndLadder.models.Player;
import com.example.SnakeAndLadder.strategy.IBoardMove;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

//@RestController
//@RequestMapping(value="/game")
public class GameController {
   /*IGameService gameService;
   public GameController(IGameService gameService){
       this.gameService = gameService;

   }*/


    public Queue<Player> launch(Game game){

            game.getBoard().print();

            while(game.getPlayerList().size() >1 ) {
                Player currentPlayer = game.getPlayerList().poll();
                System.out.println("Player " + currentPlayer.getColor() + " its your turn !!");
                System.out.println("Press r to roll a dice ...!");

                Scanner sc = new Scanner(System.in);
                char ch = sc.next().charAt(0);
                //makeMove(currentPlayer); TODO:

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
