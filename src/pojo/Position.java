package pojo;

public class Position
{
    int row;
    int col;

    public int getRow()
    {
        return row;
    }

    public int getCol()
    {
        return col;
    }

    public Position(int row, int col) {
        this.row = row;
        this.col = col;
    }

    @Override
    public String toString()
    {
        return "Position{" +
                "row=" + row +
                ", col=" + col +
                '}';
    }

    public boolean isPositionWithInBoard(int rowLimit, int colLimit) {
        if (this.row > rowLimit || this.row < 0  || this.col > colLimit || this.col < 0) {
            return false;
        }

        return true;
    }
}
