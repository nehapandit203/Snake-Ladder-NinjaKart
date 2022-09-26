package com.example.SnakeAndLadder.models;

import com.example.SnakeAndLadder.enums.CellType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Snake extends CellEntity{
    int startIndex;
    int endIndex;

    Snake(int startIndex,int endIndex){
        super(CellType.SNAKE);
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    @Override
    public String getMessage() {
        return "Opps! Snake Encountered Bad Luck";
    }

    @Override
    public String getSymbol() {
        return "S";
    }
}
