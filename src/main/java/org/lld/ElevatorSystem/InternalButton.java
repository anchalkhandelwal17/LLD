package org.lld.ElevatorSystem;

public class InternalButton {

    public InternalRequest pressButton(int destFloor){
        return new InternalRequest(destFloor);
    }
}
