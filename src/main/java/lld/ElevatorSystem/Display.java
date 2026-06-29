package lld.ElevatorSystem;

import lld.ElevatorSystem.Observer.ElevatorObserver;

public class Display implements ElevatorObserver {
    // display board will show two things -
    // 1. floorNo, 2. Direction

    private int floorNo;
    private Direction direction;

//    public Display(int floorNo, Direction direction){
//        this.floorNo = floorNo;
//        this.direction = direction;
//    }

    public void update(int floorNo, Direction direction){
        this.floorNo = floorNo;
        this.direction = direction;

        show();
    }

    public void show(){
        System.out.println("current floorNo: " + floorNo + " direction: " + direction);
    }
}
