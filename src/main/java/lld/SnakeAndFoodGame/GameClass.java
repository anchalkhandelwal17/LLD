package lld.SnakeAndFoodGame;

import java.util.*;

// Snake, Game, Board, Cell, Food, Player
// MovementStrategy for player movement
// factory for different types of food creation

class Game {
    private Board board;
    private Snake snake;
    private MovementStrategy movementStrategy;
    private GameState gameState;
    private Position currMove;
    static int score = 0;


    public Game(Board board, MovementStrategy movementStrategy, Snake snake, Position startPos){
        this.board = new Board(8);
        this.movementStrategy = movementStrategy;
        currMove = startPos;
        gameState = GameState.ACTIVE;
        snake.grow(board, startPos);
    }

}

class Snake {
    private Deque<Position> snake;
    private Set<Position> occupiedPositions;

    public void grow(Board board, Position newHead){
        snake.addFirst(newHead);
        if(!board.containsFood(newHead)){
            removeTail();
        }
    }

    // getHead(), contains(), length(), removeTail()

    public Position getHead(){
        return snake.getFirst();
    }

    public boolean contains(Position currPos){
        return occupiedPositions.contains(currPos);
    }

    public int length(){
        return snake.size();
    }

    private void removeTail(){
        snake.removeLast();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Snake snake1 = (Snake) o;
        return Objects.equals(snake, snake1.snake) && Objects.equals(occupiedPositions, snake1.occupiedPositions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(occupiedPositions);
    }
}

interface MovementStrategy {

    Position nextMove(Position currentPos, Direction direction);
}

class HumanMovementStrategy implements MovementStrategy{

    public Position nextMove(Position currentPos, Direction direction){
        // Human movement logic

        return new Position(0, 0);
    }
}

class AIMovementStrategy implements MovementStrategy{

    public Position nextMove(Position currentPos, Direction direction){
        // AI movement logic

        return new Position(0, 0);
    }
}

class Position {
    private final int row;
    private final int col;

    public Position(int row, int col){
        this.row = row;
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

}

class Board {
    private Cell[][] cell;
    private int size;

    public Board(int size){
        this.size = size;
        cell = new Cell[size][size];
        initializeBoard();

        placeFood();
    }

    private void initializeBoard(){
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                cell[i][j].setPosition(new Position(i, j));
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

    public boolean isValidPosition(Snake snake, Position position){
        // if snake do not touch boundary or bites itself logic

        if(position.getRow() >= cell.length-1 || position.getCol() >= cell[0].length-1
        || snake.contains(position)){
            return false;
        }
        return true;
    }

    public Cell getCell(Position position){
        return cell[position.getRow()][position.getCol()];
    }

    public void removeFood(Position position){
        // remove food logic
        cell[position.getRow()][position.getCol()].setFood(null);
    }

    public boolean containsFood(Position position){
        return cell[position.getRow()][position.getCol()].getFood() != null;
    }
}

class Cell {
    private Position position;
    private Food food;

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
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
//        FoodType foodType;
//        switch (food.toUpperCase()) {
//            case NORMAL -> {
//                return new NormalFood();
//            }
//
//            case SPECIAL -> {
//                return new SpecialFood();
//            }
//
//            case POISON -> {
//                return new PoisonFood();
//            }

//            default -> throw new IllegalArgumentException("Please give valid food type");


        return null;
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
