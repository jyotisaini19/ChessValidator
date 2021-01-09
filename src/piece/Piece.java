package piece;

import enums.Color;
import enums.PieceStatus;
import pojo.Cell;
import pojo.Position;

import java.util.List;

public abstract class Piece
{
    public void setColor(Color color)
    {
        this.color = color;
    }

    Color color;
    PieceStatus status;

    /**
     * Method to validate a move on piece.
     * @param cells
     * @param source
     * @param destination
     * @return
     */
    public abstract boolean validateMove(List<List<Cell>> cells, Position source, Position destination);

}
