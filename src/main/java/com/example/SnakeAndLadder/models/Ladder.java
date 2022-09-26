package com.example.SnakeAndLadder.models;

import com.example.SnakeAndLadder.enums.CellType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Ladder extends CellEntity{
    int startIndex;
    int endIndex;

    public Ladder(int startIndex,int endIndex){
        super(CellType.LADDER);
    }

    @Override
    public String getMessage() {
        return "Good Luck! You got a ladder";
    }

    @Override
    public String getSymbol() {
        return "L";
    }

    @Override
    public int nextLocation() {
        return this.endIndex;
    }
}
