package org.lld.ParkingLot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingLotMain {
    public static void main(String[] args) {

        CarParkingSlot slot1 = new CarParkingSlot(1);
        CarParkingSlot slot2 = new CarParkingSlot(2);
        BikeParkingSlot slot3 = new BikeParkingSlot(3);
        BikeParkingSlot slot4 = new BikeParkingSlot(4);

        List<ParkingSlot> parkingSlots = new ArrayList<>();
        parkingSlots.add(slot1);
        parkingSlots.add(slot2);
        parkingSlots.add(slot3);
        parkingSlots.add(slot4);

        ParkingLot parkingLot = ParkingLot.getParkingLot(parkingSlots);

        Vehicle car = VehicleFactory.createVehicle(VehicleType.CAR, "ABCD-1234");
        Vehicle bike = VehicleFactory.createVehicle(VehicleType.BIKE, "AB-987");

        parkingLot.parkVehicle(car);

        parkingLot.exitVehicle(parkingLot.getActiveTickets().get("1").getTicketId(), new UPIPayment(new HourlyPricingStrategy()));
    }
}
