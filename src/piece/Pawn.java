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

        if ((!source.isPositionWithInBoard(rowSize, colSize))
                || (!destination.isPositionWithInBoard(rowSize, colSize))
                || (this.color == Color.WHITE && destination.getRow() != (source.getRow()+1))
                || (this.color == Color.BLACK && destination.getRow() != (source.getRow()-1))) {
            return false;
        }

        return (destination.getCol() == source.getCol() && cells.get(destination.getRow()).get(destination.getCol()).getPiece().equals("--"))
                || (((destination.getCol() == source.getCol() - 1) || (destination.getCol() == source.getCol() + 1))
                && isOpponent(cells, source, destination));
    }

    private boolean isOpponent(List<List<Cell>> cells , Position source, Position destination) {
        return cells.get(destination.getRow()).get(destination.getCol()).getPiece().charAt(0)
                != cells.get(source.getRow()).get(source.getCol()).getPiece().charAt(0);
    }
}
