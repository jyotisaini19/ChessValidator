package factory;

import enums.Color;
import piece.Pawn;
import piece.Piece;
import piece.Queen;

public class PieceFactory
{

    public static Piece getPiece(String input) {
        char color = input.charAt(0);
        char pieceType = input.charAt(1);

        Piece piece=null;
        switch(pieceType) {
            case 'Q':
                piece = new Queen();
                break;
            case 'P':
                piece = new Pawn();
                break;
            default:
                System.out.println("Incorrect piece in input");
        }
        if (color == 'W')
            piece.setColor(Color.WHITE);
        else
            piece.setColor(Color.BLACK);

        return piece;
    }
}
