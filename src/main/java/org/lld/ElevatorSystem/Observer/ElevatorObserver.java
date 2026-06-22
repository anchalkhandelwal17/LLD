package org.lld.ElevatorSystem.Observer;

import org.lld.ElevatorSystem.Direction;

public interface ElevatorObserver {

    void update(int floorNo, Direction direction);
}
