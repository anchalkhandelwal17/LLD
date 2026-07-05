package lld.TicTacToe;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Board board = new Board(3);
        Player player1 = new Player();
        player1.setPlayer("Player 1");
        Player player2 = new Player();
        player2.setPlayer("Player 2");
        player1.setSymbol(Symbol.X);
        player2.setSymbol(Symbol.O);
        Queue<Player> players = new LinkedList<>();
        players.add(player1);
        players.add(player2);
        WinningStrategy row = new RowWinningStrategy();
        WinningStrategy column = new ColumnWinningStrategy();
        WinningStrategy diagonal = new DiagonalWinningStrategy();

        List<WinningStrategy> strategies = new ArrayList<>();
        strategies.add(row);
        strategies.add(column);
        strategies.add(diagonal);

        Game game = new Game(board, players, strategies);
        game.startGame();
    }
}