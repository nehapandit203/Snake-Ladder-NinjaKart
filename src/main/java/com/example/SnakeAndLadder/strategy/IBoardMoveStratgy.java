package com.example.SnakeAndLadder.strategy;

import com.example.SnakeAndLadder.models.Game;
import com.example.SnakeAndLadder.models.Player;

public interface IBoardMoveStratgy {

    void makeMove(Player postion, Game game);
}
