package org.lld.TicTacToe;

public class Move {
    private Player player;
    private int row;
    private int col;

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }
}
