package lld.Chess;

public abstract class Piece {
    private boolean isKilled = false;
    private MoveStrategy moveStrategy;
    protected Color color;
    protected boolean hasMoved;

    public Piece(Color color, MoveStrategy moveStrategy){
        this.color = color;
        this.moveStrategy = moveStrategy;
    }
    public boolean canMove(Board board, Move move){
        return moveStrategy.canMove(board, move);
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
