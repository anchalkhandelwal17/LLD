package lld.ElevatorSystem.Observer;

import lld.ElevatorSystem.Direction;

public interface ElevatorObserver {

    void update(int floorNo, Direction direction);
}
