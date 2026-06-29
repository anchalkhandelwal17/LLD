package lld.CarRentalSystem;

// Created a Vehicle class to make it extensible to use bike, taxi, etc. along with cars
public abstract class Vehicle {
    // vehicleNo, vehicleColor, brandName, isAvailable
    protected String vehicleNo;
    protected String vehicleColor;
    protected String brandName;
    protected VehicleStatus vehicleStatus;


    public Vehicle(String vehicleNo, String vehicleColor, String brandName) {
        this.vehicleNo = vehicleNo;
        this.vehicleColor = vehicleColor;
        this.brandName = brandName;
        this.vehicleStatus = VehicleStatus.AVAILABLE;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public String getVehicleColor() {
        return vehicleColor;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setVehicleStatus(VehicleStatus vehicleStatus) {
        this.vehicleStatus = vehicleStatus;
    }

    public VehicleStatus getVehicleStatus() {
        return vehicleStatus;
    }
}

class Car extends Vehicle {

    private CarType carType;

    public Car(String vehicleNo, String vehicleColor, String brandName, CarType carType){
        super(vehicleNo, vehicleColor, brandName);
        this.carType = carType;
    }
}
