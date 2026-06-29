package lld.ElevatorSystem;

public class ExternalButton {

    public ExternalRequest pressButton(int floorNo, Direction direction){
        return new ExternalRequest(floorNo, direction);
    }
}
