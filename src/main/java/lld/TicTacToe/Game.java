package lld.TicTacToe;

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

            board.printBoard();

            // Get current player
            Player currentPlayer = players.poll();
            System.out.println(currentPlayer.getPlayer() + "'s turn");

            System.out.println("Enter row:");

            int row = sc.nextInt();

            System.out.println("Enter col: ");

            int col = sc.nextInt();

            Move move = new Move(currentPlayer, row, col);

            if(!board.isValidMove(row, col)){
                System.out.println("Invalid Move: Try Again.");

                // put players back to queue
                players.offer(currentPlayer);

                continue;
            }

            // Now place move
            board.placeMove(row, col, currentPlayer.getSymbol());
            moves.add(move);

            totalMoves++;

            if(checkWinner(move)){
                board.printBoard();

                System.out.println(currentPlayer.getPlayer() + " Won the game!");

                gameState = GameState.ENDED;

                return;
            }

            if (movesPlayed == totalMoves){

                board.printBoard();

                System.out.println("Game Drawn");
                gameState = GameState.DRAW;
                return;
            }

            // Rotate turn
            players.offer(currentPlayer);
        }

    }
    private boolean checkWinner(Move move){
        for(WinningStrategy strategy : strategies){
            if(strategy.checkWinner(board, move)){
                return true;
            }
        }
        return false;
    }
}
