package lld.Chess.Pieces;

import lld.Chess.Color;
import lld.Chess.Piece;
import lld.Chess.strategies.KnightMoveStrategy;

public class Knight extends Piece {

    public Knight(Color color){
        super(color, new KnightMoveStrategy());
    }
}
