package org.lld.ElevatorSystem;

public class Door {
    private DoorState doorState;

    public void open(){
        this.doorState = DoorState.OPEN;
    }

    public void close(){
        this.doorState = DoorState.CLOSE;
    }
}
