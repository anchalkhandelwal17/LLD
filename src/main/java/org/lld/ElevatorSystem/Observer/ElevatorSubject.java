package org.lld.ElevatorSystem.Observer;

public interface ElevatorSubject {

    void registerObserver(ElevatorObserver observer);

    void removeObserver(ElevatorObserver observer);

    void notifyObserver();
}
