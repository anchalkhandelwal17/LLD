package lld.TicTacToe;

public class RowWinningStrategy implements WinningStrategy{

    @Override
    public boolean checkWinner(Board board, Move move) {
        int row = move.getRow();
        int col = move.getCol();
        String player = move.getPlayer().toString();
        Symbol currentPlayerSymbol = move.getPlayer().getSymbol();

        for(int i=0; i<board.getSize(); i++){
            Cell cell = board.getGrid()[row][i];

            if(cell.getSymbol() != currentPlayerSymbol){
                return false;
            }
        }
        return true;
    }
}
