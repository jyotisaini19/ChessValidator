package piece;

import pojo.Cell;
import pojo.Position;

import java.util.List;

public class Queen extends Piece
{

    @Override
    public boolean validateMove(List<List<Cell>> cells, Position source, Position destination)
    {
        int rowSize = cells.size();
        int colSize = cells.get(0).size();

        if (!source.isPositionWithInBoard(rowSize, colSize) || (!destination.isPositionWithInBoard(rowSize, colSize))) {
            return false;
        }

        if ( (source.getRow() == destination.getRow() && (source.getCol() != destination.getCol()))
                || (source.getCol() == destination.getCol() && (source.getRow() != destination.getRow()))
                 || (Math.abs(source.getRow()- destination.getRow())==Math.abs(source.getCol()-destination.getCol()))) {

            int [] dir = getDirection(source, destination);
            int r = dir[0];
            int c = dir[1];

            int i = source.getRow() + r;
            int j = source.getCol() + c;

            while (i != destination.getRow() && j!=destination.getCol()) {
                if (!cells.get(i).get(j).getPiece().equals("--")) {
                    return false;
                }
                i   = i + r;
                j = j +c;
            }

            return (cells.get(destination.getRow()).get(destination.getCol()).getPiece().equals("--"))
                    || cells.get(destination.getRow()).get(destination.getCol()).getPiece().charAt(0) != cells.get(source.getRow()).get(source.getCol()).getPiece().charAt(0);
        }

        return false;
    }

    private int [] getDirection(Position source, Position destination) {
        int x = 1;
        int y = 1;

        int sourceX = source.getRow();
        int sourceY = source.getCol();

        int destX = destination.getRow();
        int destY = destination.getCol();

        x = Integer.compare(destX, sourceX);
        y = Integer.compare(destY, sourceY);

       int [] dir = new int [] {x, y};
        System.out.println(dir[0] + " : " + dir[1]);
        return dir;
    }
}
