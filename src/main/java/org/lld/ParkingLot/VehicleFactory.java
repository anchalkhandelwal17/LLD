package org.lld.ParkingLot;

public class VehicleFactory {

    public static Vehicle createVehicle(VehicleType vehicleType, String numberPlate){

        if(vehicleType.equals(VehicleType.BIKE)){
            return new Bike(numberPlate);
        }
        else if(vehicleType.equals(VehicleType.CAR)){
            return new Car(numberPlate);
        }

        throw new IllegalArgumentException("Please give a valid Vehicle Type");
    }
}
