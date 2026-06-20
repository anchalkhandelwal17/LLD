package org.lld.ParkingLot;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public interface PricingStrategy {

    double calculateAmount(Ticket ticket);
}

class HourlyPricingStrategy implements PricingStrategy{

    public double calculateAmount(Ticket ticket){
        String vehicleType = ticket.getVehicle().getVehicleType().toString();
        long totalTimeVehicleParked = Duration.between(
                ticket.getEnterTime(),
                LocalDateTime.now()
        ).toHours();


        if(vehicleType.equalsIgnoreCase("car")){
            return totalTimeVehicleParked * 30;
        }
        else if(vehicleType.equalsIgnoreCase("bike")){
            return totalTimeVehicleParked * 15;
        }
        return totalTimeVehicleParked * 20;
    }
}

class FlatPricingStrategy implements PricingStrategy{

    public double calculateAmount(Ticket ticket){
        String vehicleType = ticket.getVehicle().getVehicleType().toString();

        if(vehicleType.equalsIgnoreCase("car")){
            return 60;
        }
        else if(vehicleType.equalsIgnoreCase("bike")){
            return 30;
        }
        return 50;
    }
}
