package lld.CarRentalSystem;

import java.time.LocalDate;
import java.util.HashMap;

public class RentalSystemMain {
    public static void main(String[] args) {

        // RentalStore, BookingManager, PaymentService, Customers, Vehicle(Cars)

        PaymentService paymentService = new PaymentService(new FlatPricingStrategy());
        BookingManager bookingManager = new BookingManager(paymentService, new HashMap<>());
        RentalStore rentalStore = new RentalStore(bookingManager);

        Vehicle Audi = VehicleFactory.createVehicle("AZB-2010", "Black", "Audi", CarType.SEDAN);
        Vehicle bmw = VehicleFactory.createVehicle("QUZ-0001", "Blue", "BMW", CarType.SEDAN);

        rentalStore.addVehicle(Audi);
        rentalStore.addVehicle(bmw);

        Customer customer1 = new Customer("Abczyx", "abc@gmail.com", 1020304050,
                new Address("a7dcidoa", "Bengaluru", "India", "Karnataka", 00000),
                Audi);

        Customer customer2 = new Customer("xyzczyx", "xyz@gmail.com", 902304050,
                new Address("b234doa", "Bengaluru", "India", "Karnataka", 001122),
                Audi);

        String bookingId1 = rentalStore.bookVehicle("AZB-2010", LocalDate.now().plusDays(5), LocalDate.now().plusDays(10),
                            customer1);

        System.out.println(bookingId1);
        System.out.println(rentalStore.showVehicles());

        rentalStore.returnVehicle(Audi.getVehicleNo());

    }
}
