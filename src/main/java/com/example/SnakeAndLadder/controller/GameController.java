package com.example.SnakeAndLadder.controller;

import com.example.SnakeAndLadder.Service.IGameService;
import com.example.SnakeAndLadder.models.Game;
import com.example.SnakeAndLadder.models.Player;
import com.example.SnakeAndLadder.strategy.IBoardMove;

import java.util.ArrayList;
import java.util.List;

//@RestController
//@RequestMapping(value="/game")
public class GameController {
   /*IGameService gameService;
   public GameController(IGameService gameService){
       this.gameService = gameService;

   }*/


    public List<Player> launch(Game game){

       return game.getWinnerList();
    }
}
