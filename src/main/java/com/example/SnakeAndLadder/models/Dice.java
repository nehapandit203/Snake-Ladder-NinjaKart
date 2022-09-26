package com.example.SnakeAndLadder.models;

import com.example.SnakeAndLadder.Constants;
import lombok.Getter;
import lombok.Setter;

import java.util.Random;

@Getter
@Setter
public class Dice {
     //private int maxNum =6;

     public static  int roll(){
            Random random = new Random();
            int firstDice=random.ints(1, Constants.MAX_NO_DICE).findFirst().getAsInt();
            int secondDice=random.ints(1,Constants.MAX_NO_DICE).findFirst().getAsInt();
            return firstDice+secondDice;

      }

}
