package org.lld.ElevatorSystem;

import java.util.List;

public interface SchedulingStrategy {

    public Elevator assignElevator(List<Elevator> elevators, ExternalRequest externalRequest);
}

class NearestElevatorStrategy implements SchedulingStrategy {


    @Override
    public Elevator assignElevator(List<Elevator> elevators, ExternalRequest externalRequest) {

        Elevator nearestElevator = null;
        int minDist = Integer.MAX_VALUE;

        for(Elevator e : elevators){
            int currDist = Math.abs(externalRequest.getSourceFloor() - e.getCurrentFloor());

            if(currDist < minDist){
                minDist = currDist;
                nearestElevator = e;
            }
        }

        return nearestElevator;
    }
}