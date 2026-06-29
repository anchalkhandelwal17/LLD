package lld.CarRentalSystem;

import java.time.LocalDate;
import java.util.UUID;

public class Booking {

    // bookingId, pickupDate, returnDate, customerInfo, bookingStatus, vehicleInfo

    private String bookingId;
    private LocalDate pickupDate;
    private LocalDate returnDate;
    private Customer customer;
    private BookingStatus bookingStatus;
    private Vehicle vehicle;

    public Booking(LocalDate pickupDate, LocalDate returnDate, Customer customer, Vehicle vehicle) {
        this.bookingId = UUID.randomUUID().toString();
        this.pickupDate = pickupDate;
        this.returnDate = returnDate;
        this.customer = customer;
        this.bookingStatus = BookingStatus.CONFIRMED;
        this.vehicle = vehicle;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public LocalDate getPickupDate() {
        return pickupDate;
    }

    public void setPickupDate(LocalDate pickupDate) {
        this.pickupDate = pickupDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public BookingStatus getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(BookingStatus bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
