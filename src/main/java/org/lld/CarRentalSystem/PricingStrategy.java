package org.lld.CarRentalSystem;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public interface PricingStrategy {
    // calculatePrice

    double calculatePrice(Booking booking);
}

// flatPricingStrategy, hourlyPricingStrategy, weekendPricingStrategy

class FlatPricingStrategy implements PricingStrategy {


    @Override
    public double calculatePrice(Booking booking) {
        LocalDate returnDate = LocalDate.now();

        int days = Math.toIntExact(ChronoUnit.DAYS.between(
                booking.getPickupDate(),
                booking.getReturnDate()
        ));

        return days * 500;
    }
}


