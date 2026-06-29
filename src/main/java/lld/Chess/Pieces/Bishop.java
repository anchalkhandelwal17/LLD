package lld.Chess.Pieces;

import lld.Chess.Color;
import lld.Chess.Piece;
import lld.Chess.strategies.BishopMoveStrategy;

public class Bishop extends Piece {

    public Bishop(Color color){
        super(color, new BishopMoveStrategy());
    }
}