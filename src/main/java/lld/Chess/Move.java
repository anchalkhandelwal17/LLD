package lld.Chess;

public class Move {
    Position source;
    Position destination;

    Piece movedPiece;
    Piece capturedPiece;
    Player player;

    public Move(Position source, Position destination, Piece movedPiece, Player player) {
        this.source = source;
        this.destination = destination;
        this.movedPiece = movedPiece;
        this.player = player;
    }

    public Position getSource() {
        return source;
    }

    public Position getDestination() {
        return destination;
    }

    public Piece getMovedPiece() {
        return movedPiece;
    }

    public Piece getCapturedPiece() {
        return capturedPiece;
    }

    public Player getPlayer() {
        return player;
    }

    public void setCapturedPiece(Piece capturedPiece) {
        this.capturedPiece = capturedPiece;
    }
}
