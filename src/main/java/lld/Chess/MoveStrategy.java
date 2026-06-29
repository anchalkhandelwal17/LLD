package lld.Chess;

public interface MoveStrategy {
    boolean canMove(Board board, Cell source, Cell destination);
}
