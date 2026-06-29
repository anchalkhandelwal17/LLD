package lld.CarRentalSystem;

// Although vehicle factory is really a overkill here, but I have created it to keep the
// extensibility in mind suppose if we want to extend this rental system and make it
// vehicle rental system instead of simply Car rental system

public class VehicleFactory {

    public static Vehicle createVehicle(String vehicleNo, String vehicleColor, String brandName, CarType carType){

        switch (carType){

            case SEDAN -> {
                return new Car(vehicleNo, vehicleColor, brandName, carType);
            }

            default -> {
                throw new IllegalArgumentException("Please give valid vehicle type");
            }
        }
    }
}
