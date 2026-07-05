package lld.Chess;

import lld.Chess.Pieces.King;
import lld.Chess.factory.PieceFactory;

public class Board {
    private static final int size = 8;
    private Cell[][] cells;
    private PieceFactory pieceFactory;
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

        placePiece(pieceFactory.createPiece(PieceType.KING, Color.WHITE), new Position(0, 3));
        placePiece(pieceFactory.createPiece(PieceType.KING, Color.BLACK), new Position(7, 4));
        // similarly place other pieces
    }

    public Cell getCell(Position position){
        return cells[position.getRow()][position.getCol()];
    }

    public Piece getPiece(Position position){
        return cells[position.getRow()][position.getCol()].getPiece();
    }

    public void movePiece(Move move){
        // moving the piece logic
    }

    public boolean isCellEmpty(Position position){
        return cells[position.getRow()][position.getCol()].getPiece() == null;
    }

    public void placePiece(Piece piece, Position position){
       cells[position.getRow()][position.getCol()].setPiece(piece);
    }
}
