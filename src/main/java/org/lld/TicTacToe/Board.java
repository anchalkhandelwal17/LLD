package org.lld.TicTacToe;

public class Board {

    private Cell[][] grid;
    private static int size = 3;

    public Board(int size){
        this.grid = grid;
    }

    public static int getSize() {
        return size;
    }

    public static void setSize(int size) {
        Board.size = size;
    }

    public boolean isValidMove(int row, int col){
        return grid[row][col].isEmpty();
    }

    public void placeMove(int row, int col, Symbol symbol){

    }

    public void printBoard(){
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }

    public Cell[][] getGrid() {
        return grid;
    }

    public void setGrid(Cell[][] grid) {
        this.grid = grid;
    }
}
