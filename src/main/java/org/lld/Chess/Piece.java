package org.lld.Chess;
import org.lld.Chess.MoveStrategy;

public abstract class Piece {
    private boolean isKilled = false;
    private MoveStrategy moveStrategy;
    protected Color color;

    public Piece(Color color, MoveStrategy moveStrategy){
        this.color = color;
        this.moveStrategy = moveStrategy;
    }
    public boolean canMove(Board board, Cell source, Cell destination){
        return moveStrategy.canMove(board, source, destination);
    }

    public boolean isKilled() {
        return isKilled;
    }

    public void setKilled(boolean killed) {
        isKilled = killed;
    }

    public MoveStrategy getMoveStrategy() {
        return moveStrategy;
    }

    public void setMoveStrategy(MoveStrategy moveStrategy) {
        this.moveStrategy = moveStrategy;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
