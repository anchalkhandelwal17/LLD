package lld.TicTacToe;

public class DiagonalWinningStrategy implements WinningStrategy{

    @Override
    public boolean checkWinner(Board board, Move move) {
        int row = move.getRow();
        int col = move.getCol();
        Symbol currentPlayerSymbol = move.getPlayer().getSymbol();
        boolean flag = true;

        for(int i=0; i<board.getSize(); i++){
            Cell cell = board.getGrid()[i][i];

            if(cell.getSymbol() != currentPlayerSymbol){
                flag = false;
                break;
            }
        }
        if(flag) return true;

        flag = true;
        for(int i=0; i<board.getSize(); i++){
            Cell cell = board.getGrid()[i][board.getSize() - i - 1];

            if(cell.getSymbol() != currentPlayerSymbol){
                flag = false;
                break;
            }
        }
        return flag;
    }
}
