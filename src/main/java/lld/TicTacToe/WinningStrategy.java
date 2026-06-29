package lld.TicTacToe;

public interface WinningStrategy {
    boolean checkWinner(Board board, Move move);
}


// RowWinningStrategy
// ColumnWinningStrategy
// DiagonalWinningStrategy
