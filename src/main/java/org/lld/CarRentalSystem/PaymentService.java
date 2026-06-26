package org.lld.CarRentalSystem;

import java.time.LocalDate;

public class PaymentService {

    private PricingStrategy pricingStrategy;
    private PaymentStrategy paymentStrategy;

    public PaymentService(PricingStrategy pricingStrategy){
        this.pricingStrategy = pricingStrategy;
    }

    public void completePayment(Booking booking, PaymentStrategy paymentStrategy){
        double amount = pricingStrategy.calculatePrice(booking);

        paymentStrategy.makePayment(amount);
    }
}
