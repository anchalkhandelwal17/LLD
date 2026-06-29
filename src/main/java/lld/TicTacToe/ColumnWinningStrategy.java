package lld.TicTacToe;

public class ColumnWinningStrategy implements WinningStrategy{

    @Override
    public boolean checkWinner(Board board, Move move) {
        int row = move.getRow();
        int col = move.getCol();
        Symbol currentPlayerSymbol = move.getPlayer().getSymbol();

        for(int i=0; i<board.getSize(); i++) {
            Cell cell = board.getGrid()[i][col];

            if(cell.getSymbol() != currentPlayerSymbol){
                return false;
            }
        }
        return true;
    }
}
