package org.lld.ElevatorSystem;

public class Display {
    // display board will show two things -
    // 1. floorNo, 2. Direction

    private int floorNo;
    private Direction direction;

    public Display(int floorNo, Direction direction){
        this.floorNo = floorNo;
        this.direction = direction;
    }

    public void show(){
        System.out.println(floorNo + " " + direction);
    }
}
