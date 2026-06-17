package org.lld.SnakeAndFoodGame;

import java.util.*;

// Snake, Game, Board, Cell, Food, Player
// MovementStrategy for player movement
// factory for different types of food creation

class Game {
    private Board board;
    private Player player;
    private MovementStrategy movementStrategy;
    private GameState gameState;
    private Position currMove;


    public Game(Board board, Player player, MovementStrategy movementStrategy, Snake snake){
        this.board = new Board(8);
        this.player = player;
        this.movementStrategy = movementStrategy;
    }

}

class Snake {
    private Deque<Position> snake;
    private Set<Position> occupiedPositions;

    void Move(Position newHead){

    }

    void grow(Position newHead){

    }


}

interface MovementStrategy {

    Position nextMove(Position currentPos, Direction direction);
}

class HumanMovementStrategy implements MovementStrategy{

    public Position nextMove(Position currentPos, Direction direction){
        // Human movement logic
    }
}

class AIMovementStrategy implements MovementStrategy{

    public Position nextMove(Position currentPos, Direction direction){
        // AI movement logic
    }
}

class Player {
    private String name;

    public Player(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Position {
    int row;
    int col;

    public Position(int row, int col){
        this.row = row;
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }
}


class Board {
    private Cell[][] cell;
    private int size;

    public Board(int size){
        this.size = size;
        initializeBoard();

        placeFood();
    }

    private void initializeBoard(){
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                cell[i][j] = new Cell(i, j);
            }
        }
    }

    private void placeFood(){

        cell[0][5].setFood(FoodFactory.createFood("normal"));
        cell[2][3].setFood(FoodFactory.createFood("special"));
        cell[3][1].setFood(FoodFactory.createFood("poison"));
        cell[4][4].setFood(FoodFactory.createFood("normal"));
        cell[5][6].setFood(FoodFactory.createFood("special"));
    }
}

class Cell {
    private int row;
    private int col;
    private Food food;

    public Cell(int row, int col){
        this.row = row;
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }
}

abstract class Food {
    protected int score;

    public Food(int score){
        this.score = score;
    }
}

class NormalFood extends Food {

    public NormalFood(){
        super(1);
    }
}


class SpecialFood extends Food {

    public SpecialFood(){
        super(2);
    }
}

class PoisonFood extends Food {

    public PoisonFood(){
        super(-1);
    }
}

class FoodFactory {

    public static Food createFood(String food){
        FoodType foodType;
        switch (food.toUpperCase()) {
            case FoodType.NORMAL -> {
                return new NormalFood();
            }

            case FoodType.SPECIAL -> {
                return new SpecialFood();
            }

            case FoodType.POISON -> {
                return new PoisonFood();
            }

            default -> throw new IllegalArgumentException("Please give valid food type");
        }
    }
}

enum FoodType {

    NORMAL,
    SPECIAL,
    POISON
}

enum GameState {
    ACTIVE,
    GAMEOVER
}

enum Direction {
    UP,
    DOWN,
    LEFT,
    RIGHT
}

public class GameClass {
    public static void main(String[] args) {

    }
}
