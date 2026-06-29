package lld.CarRentalSystem;

import java.time.LocalDate;
import java.util.*;

public class RentalStore {
    // list of all the vehicles

//    private List<Vehicle> allVehicles;
    private Map<String, Vehicle> allVehicles;
    private BookingManager bookingManager;

    // we could implement booking here or create a different bookingManager itself
    // to handle bookings

    // showAllVehicles, book the vehicle,

    public RentalStore(BookingManager bookingManager){
        this.allVehicles = new HashMap<>();
        this.bookingManager = bookingManager;
    }

    public void addVehicle(Vehicle vehicle){
        allVehicles.put(vehicle.getVehicleNo(), vehicle);
    }

    public List<Vehicle> showVehicles(){
        List<Vehicle> availableVehicles = new ArrayList<>();
        for(Vehicle vehicle : allVehicles.values()){
            if(vehicle.vehicleStatus.equals(VehicleStatus.AVAILABLE)){
                availableVehicles.add(vehicle);
            }
        }
        return availableVehicles;
    }

    public String  bookVehicle(String vehicleNo, LocalDate fromDate, LocalDate toDate, Customer customer){
         Vehicle vehicle = allVehicles.get(vehicleNo);
         Booking booking = bookingManager.createBooking(fromDate, toDate, customer, vehicle);
         return booking.getBookingId();
    }

    public void returnVehicle(String vehicleNo){
        Vehicle vehicle = bookingManager.getBooking(vehicleNo).getVehicle();
        bookingManager.completeBooking(LocalDate.now(), vehicleNo, vehicle);
    }

}
