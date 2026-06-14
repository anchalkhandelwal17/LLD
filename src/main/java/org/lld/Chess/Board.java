package org.lld.Chess;

import org.lld.Chess.Pieces.King;
import org.lld.Chess.factory.PieceFactory;

public class Board {
    private static int size = 8;
    private Cell[][] cells;
    public Board(){
        initializeBoard();
    }

    private void initializeBoard(){
        cells = new Cell[size][size];

        for(int row=0; row<size; row++){
            for(int col=0; col<size; col++){
                cells[row][col] = new Cell(new Position(row, col));
            }
        }

        setUpPieces();
    }

    private void setUpPieces(){
        placePiece(new King(Color.WHITE), 7, 4);
        placePiece(new King(Color.BLACK), 0, 4);

        // similarly place other pieces
    }

    public Cell getCell(int row, int col){
        return cells[row][col];
    }

    public Piece getPiece(int row, int col){
        return cells[row][col].getPiece();
    }

    public void movePiece(Move move){
        // moving the piece logic
    }

    public boolean isCellEmpty(int row, int col){
        return cells[row][col].getPiece() == null;
    }

    public void placePiece(Piece piece, int row, int col){
       cells[row][col].setPiece(piece);
    }
}
