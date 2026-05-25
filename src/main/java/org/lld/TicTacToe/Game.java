package org.lld.TicTacToe;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Game {

    private Board board;
    private Queue<Player> players;
    private GameState gameState;
    private List<WinningStrategy> strategies;
    private List<Move> moves;

    private int totalMoves;
    private int movesPlayed;

    public Game(Board board, Queue<Player> players, List<WinningStrategy> strategies){
        this.board = board;
        this.players = players;
        this.strategies = strategies;
        this.moves = new ArrayList<>();
        this.gameState = GameState.IN_PROGRESS;
        this.totalMoves = board.getSize() * board.getSize();
        this.movesPlayed = 0;
    }

    public void startGame(){

        Scanner sc = new Scanner(System.in);

        while(gameState == GameState.IN_PROGRESS){

        }
    }
}
