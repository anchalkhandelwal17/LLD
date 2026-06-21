package org.lld.ElevatorSystem;

public class Floor {
    private final int floorNumber;
    private ExternalButton externalButton;

    public Floor(int floorNumber, ExternalButton externalButton){
        this.floorNumber = floorNumber;
        this.externalButton = externalButton;
    }
}
