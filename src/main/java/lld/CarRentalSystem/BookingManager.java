package lld.CarRentalSystem;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

//private String bookingId;
//private LocalDate pickupDate;
//private LocalDate returnDate;
//private Customer customer;
//private BookingStatus bookingStatus;
//private Vehicle vehicle;

public class BookingManager {
    // createBooking, cancelBooking, completeBooking

    private PaymentService paymentService;
    Map<String, Booking> bookings = new HashMap<>();

    public BookingManager(PaymentService paymentService, Map<String, Booking> bookings) {
        this.paymentService = paymentService;
        this.bookings = bookings;
    }

    public Map<String, Booking> getBookings() {
        return bookings;
    }

    public Booking createBooking(LocalDate pickupDate, LocalDate returnDate, Customer customer, Vehicle vehicle){
        Booking booking = new Booking(pickupDate, returnDate, customer, vehicle);

        String vehicleNo = vehicle.getVehicleNo();
        vehicle.setVehicleStatus(VehicleStatus.BOOKED);
        bookings.put(vehicleNo, booking);
        return booking;
    }

    public Booking getBooking(String id){
        return bookings.get(id);
    }

    public void cancelBooking(String bookingId, Vehicle vehicle){
        Booking booking = bookings.get(bookingId);
        booking.setBookingStatus(BookingStatus.CANCELLED);
        vehicle.setVehicleStatus(VehicleStatus.AVAILABLE);
        bookings.remove(bookingId);
        System.out.println("Booking with id: " + bookingId + " has been cancelled successfully");
    }

    public void completeBooking(LocalDate currDate, String bookingId, Vehicle vehicle){
        Booking booking = bookings.get(bookingId);
        booking.setBookingStatus(BookingStatus.COMPLETED);
        vehicle.setVehicleStatus(VehicleStatus.AVAILABLE);
        paymentService.completePayment(bookings.get(bookingId), new UPIPayment());
        bookings.remove(bookingId);
    }
}
