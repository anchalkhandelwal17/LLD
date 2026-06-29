package lld.ElevatorSystem;

public class InternalRequest {
    private final int destFloor;

    public InternalRequest(int destFloor){
        this.destFloor = destFloor;
    }

    public int getDestFloor() {
        return destFloor;
    }
}
