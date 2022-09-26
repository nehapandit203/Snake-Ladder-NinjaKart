package com.example.SnakeAndLadder.Service;

import com.example.SnakeAndLadder.models.Game;
import org.springframework.stereotype.Service;

@Service
public interface IGameService {
   void run(Game game);
   void makeMove();
}
