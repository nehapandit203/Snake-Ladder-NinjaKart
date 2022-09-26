package com.example.SnakeAndLadder.models;

import com.example.SnakeAndLadder.enums.CellType;
import lombok.Getter;

@Getter
public abstract class CellEntity {
    private CellType cellType;

    public CellEntity(CellType cellType){
        this.cellType = cellType;
    }

    public abstract String getMessage();
    public abstract String getSymbol();

}
