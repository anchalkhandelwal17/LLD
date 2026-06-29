package lld.Chess.Pieces;

import lld.Chess.Color;
import lld.Chess.Piece;
import lld.Chess.strategies.KingMoveStrategy;

public class King extends Piece {

    public King(Color color){
        super(color, new KingMoveStrategy());
    }

}
