package org.lld.ElevatorSystem;

import java.util.List;

public class ElevatorMain {
    public static void main(String[] args) {

        Elevator elevator1 = new Elevator(1, 0, new Door());
        Elevator elevator2 = new Elevator(2, 0, new Door());
        Elevator elevator3 = new Elevator(3, 0, new Door());
        Elevator elevator4 = new Elevator(4, 0, new Door());

        elevator1.registerObserver(new Display());

        Floor floor1 = new Floor(1, new ExternalButton());
        Floor floor2 = new Floor(2, new ExternalButton());
        Floor floor3 = new Floor(3, new ExternalButton());
        Floor floor4 = new Floor(4, new ExternalButton());

        List<Floor> floors = List.of(floor1, floor2, floor3, floor4);

        List<Elevator> elevators = List.of(elevator1, elevator2, elevator3, elevator4);

        ElevatorController elevatorController = new ElevatorController(elevators, new NearestElevatorStrategy());

        Building building = new Building(floors, elevatorController);

        Elevator assignedElevator = elevatorController.assignElevator(new ExternalRequest(2, Direction.UP));
        InternalButton internalButton = new InternalButton();
        assignedElevator.addNewRequest(internalButton.pressButton(4));

        assignedElevator.move();
    }
}
