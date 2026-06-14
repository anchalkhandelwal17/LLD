package org.lld.Chess.factory;

import org.lld.Chess.Color;
import org.lld.Chess.Piece;
import org.lld.Chess.PieceType;
import org.lld.Chess.Pieces.King;
import org.lld.Chess.Pieces.Knight;

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
