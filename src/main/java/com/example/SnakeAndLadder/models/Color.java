package com.example.SnakeAndLadder.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Collections;

@Getter
@Setter
public class Color {
    private String color;

    public Color(String color){
        this.color = color;
    }
}
