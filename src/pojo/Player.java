package pojo;

import enums.Color;
import piece.Piece;

import java.util.List;

public class Player
{

    String name;

    public Player(String name, Color color)
    {
        this.name = name;
        this.color = color;
    }

    Color color;

}
