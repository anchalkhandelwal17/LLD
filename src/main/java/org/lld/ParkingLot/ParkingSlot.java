package org.lld.ParkingLot;

public abstract class ParkingSlot {
    protected int slotNumber;
    protected boolean isSlotAvailable;
    protected VehicleType vehicleType;
    protected Vehicle vehicle;

    public ParkingSlot(int slotNumber){
        this.slotNumber = slotNumber;
    }

    public int getSlotNumber() {
        return slotNumber;
    }

    public void setSlotNumber(int slotNumber) {
        this.slotNumber = slotNumber;
    }

    public boolean isSlotAvailable() {
        return isSlotAvailable;
    }

    public void setSlotAvailable(boolean slotAvailable) {
        isSlotAvailable = slotAvailable;
    }

    public abstract void park(Vehicle vehicle);

    public abstract void unPark(Vehicle vehicle);
}

class CarParkingSlot extends ParkingSlot {

    public CarParkingSlot(int slotNumber){
        super(slotNumber);
        this.isSlotAvailable = true;
        this.vehicleType = VehicleType.CAR;
    }

    @Override
    public void park(Vehicle vehicle){
        this.isSlotAvailable = false;
        this.vehicle = vehicle;
        System.out.println("Vehicle number " + vehicle.getNumberPlate() + " has been parked successfully");
    }

    @Override
    public void unPark(Vehicle vehicle){
        this.isSlotAvailable = true;
        this.vehicle = null;
        System.out.println("Vehicle number " + vehicle.getNumberPlate() + " unparked");
    }

}

class BikeParkingSlot extends ParkingSlot {

    public BikeParkingSlot(int slotNumber){
        super(slotNumber);
        this.isSlotAvailable = true;
        this.vehicleType = VehicleType.BIKE;
    }

    @Override
    public void park(Vehicle vehicle){
        this.isSlotAvailable = false;
        this.vehicle = vehicle;
        System.out.println("Vehicle number " + vehicle.getNumberPlate() + " has been parked successfully");
    }

    @Override
    public void unPark(Vehicle vehicle){
        this.isSlotAvailable = true;
        this.vehicle = null;
        System.out.println("Vehicle number " + vehicle.getNumberPlate() + " unparked");
    }

}
