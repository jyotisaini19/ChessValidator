package game;

import factory.PieceFactory;
import pojo.Player;
import pojo.Position;

import java.util.List;

public class Game
{
    Board board;
    List<Player> players;

    public Game(List<List<String>> cells, List<Player> players)
    {
        this.board = new Board();
        this.board.initialize(cells);
        this.players = players;
    }

    /**
     * Method to make move.
     * @param move
     */
    public void makeMove(String move) {
        String [] m =move.split(" ");
        String piece = m[0];
        Position source =  getPosition(m[1]);
        Position destination = getPosition(m[2]);

        System.out.println(" ------ ");

        System.out.println("Move: "  + piece + " : " + source + " : "  + destination);

        if (! (PieceFactory.getPiece(piece).validateMove(board.getCells(), source, destination)) ) {
            System.out.println("Not a valid Move!!");
            return;
        }

        System.out.println("Valid Move!!");

        this.board.update(piece, source, destination);
    }

    private Position getPosition(String pos) {
        return new Position(Integer.parseInt(String.valueOf(pos.charAt(0))), Integer.parseInt(String.valueOf(pos.charAt(1))));
    }
}
