package org.lld.Chess.Pieces;

import org.lld.Chess.Color;
import org.lld.Chess.Piece;
import org.lld.Chess.strategies.KingMoveStrategy;
import org.lld.Chess.strategies.KnightMoveStrategy;

public class Knight extends Piece {

    public Knight(Color color){
        super(color, new KnightMoveStrategy());
    }
}
