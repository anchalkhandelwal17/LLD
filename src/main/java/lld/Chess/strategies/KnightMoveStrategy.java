package lld.Chess.strategies;

import lld.Chess.Board;
import lld.Chess.Cell;
import lld.Chess.Move;
import lld.Chess.MoveStrategy;

public class KnightMoveStrategy implements MoveStrategy {
    @Override
    public boolean canMove(Board board, Move move) {

        int rowDiff = Math.abs(move.getSource().getRow()) - move.getDestination().getRow();

        int colDiff = Math.abs(move.getSource().getCol())- move.getDestination().getCol();

        return (rowDiff == 2 && colDiff == 1) || (rowDiff == 1 && colDiff == 2);
    }
}
