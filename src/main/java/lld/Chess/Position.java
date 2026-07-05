package lld.Chess;

public class Position {
    int row;
    int col;

    public Position(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public boolean isValid(){
        return row >= 0 && row < 8 && col >= 0 && col < 8;
    }
}
