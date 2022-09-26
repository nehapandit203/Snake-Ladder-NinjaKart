package com.example.SnakeAndLadder;

import com.example.SnakeAndLadder.controller.GameController;
import com.example.SnakeAndLadder.models.*;
import com.example.SnakeAndLadder.strategy.MoveToTail;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

@SpringBootApplication
public class SnakeAndLadderApplication {

	public static void main(String[] args) {

		SpringApplication.run(SnakeAndLadderApplication.class, args);

		//Inputs needed
		Player p1 = new HumanPlayer(new Color("Green"),"Raj");//TODO: builder pattern
		Player p2 = new HumanPlayer(new Color("Blue"),"Ram");
		Player p3 = new ComputerPlayer(new Color("Red"),"Robot");

		Queue<Player> players = new LinkedList<>();
		players.add(p1);
		players.add(p2);
		players.add(p3);
		Game game = new Game();//builder
		game.setPlayerList(players);
		game.setMakeMove(new MoveToTail());


		GameController gameController = new GameController();
		gameController.launch(game);
	}

}
