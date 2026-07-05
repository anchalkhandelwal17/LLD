package lld.Chess;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Game {
    Board board;
    Queue<Player> players = new LinkedList<>();
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
