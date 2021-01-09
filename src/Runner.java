import game.Game;
import pojo.Player;

import java.util.ArrayList;
import java.util.List;

public class Runner
{
    public static void main(String[] args)
    {
        List<List<String>> cells = new ArrayList<>(8);


        String board[][] = {
                {"WR", "WH", "WC", "WK", "WQ", "WC", "WH", "WR"},
                {"WP", "WP", "WP", "WP", "WP", "WP", "WP", "WP"},
                {"--", "--", "--", "--", "--", "--", "--", "--"},
                {"--", "--", "--", "--", "--", "--", "--", "--"},
                {"--", "--", "--", "--", "--", "--", "--", "--"},
                {"--", "--", "--", "--", "--", "--", "--", "--"},
                {"BP", "BP", "BP", "BP", "BP", "BP", "BP", "BP"},
                {"BR", "BH", "BC", "BQ", "BK", "BC", "BH", "BR"}
        };

        for (int i = 0 ;i < board.length ; i++) {
            cells.add(new ArrayList<>());

            for (int j = 0 ; j < board[i].length ;j ++) {
                cells.get(i).add(board[i][j]);
            }
        }

        List<Player> players  = new ArrayList<>();
        Game game = new Game(cells, players);
        game.makeMove("WQ 04 22");

        game.makeMove("WP 13 23");
        game.makeMove("WQ 04 22");
        game.makeMove("WQ 22 66");
        game.makeMove("WQ 66 41");
        game.makeMove("WQ 66 90");

        game.makeMove("WP 17 37");
        game.makeMove("WP 17 27");

        game.makeMove("WP 23 33");
        game.makeMove("WP 33 43");
        game.makeMove("WP 43 53");

        game.makeMove("WP 53 64");

        game.makeMove("WP 27 37");
        game.makeMove("WP 37 47");
        game.makeMove("WP 47 57");

        game.makeMove("WP 57 66");
    }
}
