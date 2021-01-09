package piece;

import enums.Color;
import pojo.Cell;
import pojo.Position;

import java.util.List;

public class Pawn extends Piece
{
    @Override
    public boolean validateMove(List<List<Cell>> cells, Position source, Position destination)
    {
        int rowSize = cells.size();
        int colSize = cells.get(0).size();

        if ((!source.isPositionWithInBoard(rowSize, colSize)) || (!destination.isPositionWithInBoard(rowSize, colSize))) {
            return false;
        }

        if ( ((this.color == Color.WHITE) && (destination.getRow() < source.getRow()))
                || (this.color== Color.BLACK && (destination.getRow() >  source.getRow()))
                || (!(Math.abs(destination.getRow() - source.getRow()) == 1))) {
            return false;
        }

        if ( Math.abs(destination.getCol() - source.getCol()) == 0) {
            return (cells.get(destination.getRow()).get(destination.getCol()).getPiece().equals("--")
                    || cells.get(destination.getRow()).get(destination.getCol()).getPiece().charAt(0) != cells.get(source.getRow()).get(source.getCol()).getPiece().charAt(0));
        }

        if (Math.abs(destination.getCol() - source.getCol()) == 1) {
            return !(cells.get(destination.getRow()).get(destination.getCol()).getPiece().equals("--") || cells.get(destination.getRow()).get(destination.getCol()).getPiece().charAt(0) == cells.get(source.getRow()).get(source.getCol()).getPiece().charAt(0));
        }

        return false;
    }
}
