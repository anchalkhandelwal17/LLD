package org.lld.TicTacToe;

public class Board {

    private Cell[][] grid;

    private int size;

    public Board(int size) {

        this.size = size;

        this.grid = new Cell[size][size];

        initializeBoard();
    }

    private void initializeBoard() {

        for(int i = 0; i < size; i++) {

            for(int j = 0; j < size; j++) {

                grid[i][j] = new Cell(i, j);
            }
        }
    }

    public int getSize() {
        return size;
    }

    public boolean isValidMove(int row, int col) {

        // Boundary check
        if (row < 0 || row >= size || col < 0 || col >= size) {
            return false;
        }

        // Cell empty check
        return grid[row][col].isEmpty();
    }

    public void placeMove(int row, int col, Symbol symbol) {

        grid[row][col].setSymbol(symbol);
    }

    public void printBoard() {

        for(int i = 0; i < size; i++) {

            for(int j = 0; j < size; j++) {

                Symbol symbol = grid[i][j].getSymbol();

                if(symbol == null) {
                    System.out.print("- ");
                }
                else {
                    System.out.print(symbol + " ");
                }
            }

            System.out.println();
        }
    }

    public Cell[][] getGrid() {
        return grid;
    }
}
