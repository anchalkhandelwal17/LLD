package lld.Chess.factory;

import lld.Chess.Color;
import lld.Chess.Piece;
import lld.Chess.PieceType;
import lld.Chess.Pieces.King;
import lld.Chess.Pieces.Knight;

public class PieceFactory {

    public static Piece createPiece(PieceType pieceType, Color color) {

        switch (pieceType) {

            case KING -> {
                return new King(color);
            }
            case KNIGHT -> {
                return new Knight(color);
            }
            // Queen, Rook, Bishop, Pawn

            default -> {
                throw new IllegalArgumentException();
            }
        }
    }
}
