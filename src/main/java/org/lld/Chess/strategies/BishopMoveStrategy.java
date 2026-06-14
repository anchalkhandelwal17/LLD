package org.lld.Chess.strategies;

import org.lld.Chess.Board;
import org.lld.Chess.Cell;
import org.lld.Chess.MoveStrategy;

public class BishopMoveStrategy implements MoveStrategy {

    @Override
    public boolean canMove(Board board, Cell source, Cell destination) {

        int rowDiff = Math.abs(source.getPosition().getRow()) - destination.getPosition().getRow();

        int colDiff = Math.abs(source.getPosition().getCol()) - destination.getPosition().getCol();

        return rowDiff == colDiff;
    }
}
