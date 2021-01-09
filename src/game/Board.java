package game;

import pojo.Cell;
import pojo.Position;
import java.util.ArrayList;
import java.util.List;

public class Board
{
    List<List<Cell>> cells;

    public List<List<Cell>> getCells()
    {
        return cells;
    }

    public Board() {
        this.cells = new ArrayList<>(8);
    }

    /**
     * Method to initialize board.
     * @param input
     */
    public void  initialize(List<List<String>> input) {

        for (int i = 0 ; i < input.size() ; i++) {
            this.cells.add(new ArrayList<>());
            for (int j = 0 ; j < input.get(i).size() ; j++) {

                    this.cells.get(i).add(new Cell(new Position(i, j), input.get(i).get(j), false));
            }
        }
        display();
    }

    private void display() {
        System.out.println(" -----  Current board status ----- ");
        for (int i = 0 ; i < cells.size() ; i++) {
            for (int j = 0 ; j < cells.get(i).size() ; j++) {
                System.out.print(this.cells.get(i).get(j).getPiece() + " ");
            }
            System.out.println();
        }
    }

    /**
     * Updating board with the new move.
     * @param peiece
     * @param source
     * @param destination
     */
    public void update(String peiece, Position source, Position destination) {
       this.cells.get(source.getRow()).get(source.getCol()).setPiece("--");
       this.cells.get(destination.getRow()).get(destination.getCol()).setPiece(peiece);
       display();
    }

}
