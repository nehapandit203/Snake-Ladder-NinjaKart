package com.example.SnakeAndLadder.Service;

import com.example.SnakeAndLadder.models.Game;
import com.example.SnakeAndLadder.models.Player;
import org.springframework.stereotype.Service;

import java.util.Queue;

@Service
public interface IGameService {
   Queue<Player> run(Game game);
}
