package lld.Chess.strategies;

import lld.Chess.Board;
import lld.Chess.Cell;
import lld.Chess.MoveStrategy;

public class KingMoveStrategy implements MoveStrategy {

    @Override
    public boolean canMove(Board board, Cell source, Cell destination) {

        int rowDiff = Math.abs(source.getPosition().getRow() - destination.getPosition().getRow());

        int colDiff = Math.abs(source.getPosition().getCol() - destination.getPosition().getCol());

        return rowDiff <= 1 && colDiff <= 1;
    }
}
