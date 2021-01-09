package pojo;

public class Cell
{
    Position position;
    String piece;

    public Cell(Position position, String piece, boolean isEmpty)
    {
        this.position = position;
        this.piece = piece;
    }

    public void setPiece(String piece)
    {
        this.piece = piece;
    }


    public String getPiece()
    {
        return piece;
    }

    public Position getPosition()
    {
        return position;
    }

    @Override
    public String toString()
    {
        return "Cell{" +
                "position=" + position +
                ", piece='" + piece + '\'' +
                '}';
    }
}
