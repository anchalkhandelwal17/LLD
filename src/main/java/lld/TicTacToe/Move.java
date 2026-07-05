package lld.TicTacToe;

public class Move {
    private Player player;
    private int row;
    private int col;

    public Move(Player player, int row, int col){
        this.player = player;
        this.row = row;
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public Player getPlayer() {
        return player;
    }

    public int getCol() {
        return col;
    }

}
