package org.lld.Chess.Pieces;

import org.lld.Chess.Board;
import org.lld.Chess.Cell;
import org.lld.Chess.Color;
import org.lld.Chess.Piece;
import org.lld.Chess.strategies.BishopMoveStrategy;

public class Bishop extends Piece {

    public Bishop(Color color){
        super(color, new BishopMoveStrategy());
    }
}