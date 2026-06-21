package org.lld.ElevatorSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Elevator {
    // each elevator will have requests -> internal
    // each elevator will have door as well
    private int id;
    private int currentFloor;
//    private List<InternalButton> internalButtons;
    private InternalButton internalButton;
    private Door door;
//    private List<InternalRequest> requests;
    private Direction direction;
    private ElevatorState elevatorState;
    private PriorityQueue<InternalRequest> upRequest;   // min-heap
    private PriorityQueue<InternalRequest> downRequest;  // max-heap

    public Elevator(int id, int currentFloor,
                    Door door){
        this.id = id;
        this.currentFloor = currentFloor;
        this.door = door;
        this.direction = Direction.IDLE;
        this.elevatorState = ElevatorState.IDLE;
        this.upRequest = new PriorityQueue<>((a, b) -> Integer.compare(a.getDestFloor(), b.getDestFloor()));
        this.downRequest = new PriorityQueue<>((a, b) -> Integer.compare(b.getDestFloor(), a.getDestFloor()));
    }

    public PriorityQueue<InternalRequest> getUpRequest() {
        return upRequest;
    }

    public void setUpRequest(PriorityQueue<InternalRequest> upRequest) {
        this.upRequest = upRequest;
    }

    public PriorityQueue<InternalRequest> getDownRequest() {
        return downRequest;
    }

    public void setDownRequest(PriorityQueue<InternalRequest> downRequest) {
        this.downRequest = downRequest;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public InternalButton getInternalButton() {
        return internalButton;
    }

    public void setInternalButton(InternalButton internalButton) {
        this.internalButton = internalButton;
    }

    public void addNewRequest(InternalRequest request){
        if(request.getDestFloor() > currentFloor){
            upRequest.add(request);
        }
        else downRequest.add(request);
    }

    public void move(){

        // take all upRequests and serve them
        // take all downRequests and serve them
        // stop lift
        elevatorState = ElevatorState.MOVING;

        while(!upRequest.isEmpty()){
            InternalRequest request = upRequest.poll();
            goToFloor(request.getDestFloor());
        }

        while(!downRequest.isEmpty()){
            InternalRequest request = downRequest.poll();
            goToFloor(request.getDestFloor());
        }

        stop();
    }

    private void goToFloor(int destinationFloor){

        direction = destinationFloor > currentFloor ? Direction.UP : Direction.DOWN;

        while (currentFloor != destinationFloor){

            if(currentFloor < destinationFloor){
                currentFloor++;
            }
            else{
                currentFloor--;
            }

            System.out.println("Current Floor: " + currentFloor);
        }

        stop();
        System.out.println("Reached at floor " + destinationFloor + " opening door..");
        openDoor();
        System.out.println("closing door");
        closeDoor();
    }

    public void stop(){
        this.elevatorState = ElevatorState.IDLE;
        this.direction = Direction.IDLE;
    }

    public void openDoor(){
        this.door.open();
    }

    public void closeDoor(){
        this.door.close();
    }

    public void addRequest(InternalRequest request){

        int destinationFloor = request.getDestFloor();

        if(destinationFloor > currentFloor){
            upRequest.add(request);
        }
        else if(destinationFloor < currentFloor){
            downRequest.add(request);
        }

        processNextRequest();
    }

    private void processNextRequest(){

        if(elevatorState == ElevatorState.MOVING){
            return;
        }

        if(!upRequest.isEmpty()){
            moveUp();
        }
        if(!downRequest.isEmpty()){
            moveDown();
        }
    }

    public void moveUp(){
        elevatorState = ElevatorState.MOVING;

        while(!upRequest.isEmpty()){
            InternalRequest request = upRequest.poll();
            goToFloor(request.getDestFloor());
        }

        elevatorState = ElevatorState.IDLE;
    }

    public void moveDown(){
        elevatorState = ElevatorState.MOVING;

        while(!downRequest.isEmpty()){
            InternalRequest request = downRequest.poll();
            goToFloor(request.getDestFloor());
        }

        elevatorState = ElevatorState.IDLE;
    }
}
