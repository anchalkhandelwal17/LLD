package lld.Chess;

import java.util.List;

public class Game {
    Board board;
    Player whitePlayer;
    Player blackPlayer;
    Player currentPlayer;
    GameStatus gameStatus;
    List<Move> moves;

    public void startGame(){

    }

    public void switchTurn(){

    }
    public boolean makeMove(Move move){
        return true;
    }

    public boolean isCheck(){
        return false;
    }

    public boolean isCheckMate(){
        return false;
    }

    public boolean isStaleMate(){
        return false;
    }

    public void endGame(){

    }
}
