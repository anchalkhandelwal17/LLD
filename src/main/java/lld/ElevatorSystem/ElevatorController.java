package lld.ElevatorSystem;

import java.util.List;

public class ElevatorController {

    // will have list of all the elevators, optimal scheduling strategy for elevators
    private List<Elevator> elevators;

    private SchedulingStrategy schedulingStrategy;

    public ElevatorController(List<Elevator> elevators, SchedulingStrategy schedulingStrategy){
        this.elevators = elevators;
        this.schedulingStrategy = schedulingStrategy;
    }

    public Elevator assignElevator(ExternalRequest externalRequest){

        Elevator assignedElevator = schedulingStrategy.assignElevator(elevators, externalRequest);

//        InternalRequest request = assignedElevator.getInternalButton().pressButton(4);

        return assignedElevator;
    }
}
