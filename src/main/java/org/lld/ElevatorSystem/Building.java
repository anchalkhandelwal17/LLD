package org.lld.ElevatorSystem;

import java.util.List;

public class Building {

    // building will have floors, elevators, elevatorController
    private List<Floor> floors;

    private ElevatorController elevatorController;

    public Building(List<Floor> floors, ElevatorController elevatorController){
        this.floors = floors;
        this.elevatorController = elevatorController;
    }
}
