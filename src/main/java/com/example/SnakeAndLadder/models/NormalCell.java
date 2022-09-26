package com.example.SnakeAndLadder.models;


import com.example.SnakeAndLadder.enums.CellType;

public class NormalCell extends CellEntity{

    public NormalCell(CellType cellType) {
        super(cellType);
    }

    public String getMessage() {
        return "Normal-Cell";
    }

    @Override
    public String getSymbol() {
        return " ";
    }
}
