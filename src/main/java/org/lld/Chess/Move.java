package org.lld.Chess;

public class Move {
    Position source;
    Position destination;

    Piece movedPiece;
    Piece capturedPiece;

    public Move(Position source, Position destination, Piece movedPiece) {
        this.source = source;
        this.destination = destination;
        this.movedPiece = movedPiece;
    }
}
