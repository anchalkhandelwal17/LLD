package org.lld.ParkingLot;

public abstract class Vehicle {
    private VehicleType vehicleType;
    private String numberPlate;

    public Vehicle(VehicleType vehicleType, String numberPlate){
        this.vehicleType = vehicleType;
        this.numberPlate = numberPlate;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }
}

class Car extends Vehicle{

    public Car(String numberPlate){
        super(VehicleType.CAR, numberPlate);
    }
}

class Bike extends Vehicle{

    public Bike(String numberPlate){
        super(VehicleType.BIKE, numberPlate);
    }
}
