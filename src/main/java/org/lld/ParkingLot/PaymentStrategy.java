package org.lld.ParkingLot;

public abstract class PaymentStrategy {
    protected PricingStrategy pricingStrategy;

    public PaymentStrategy(PricingStrategy pricingStrategy){
        this.pricingStrategy = pricingStrategy;
    }
    abstract void ProcessPayment(Ticket ticket);
}

// different payment modes / strategies
class UPIPayment extends PaymentStrategy {

    public UPIPayment(PricingStrategy pricingStrategy){
        super(pricingStrategy);
    }

    public void ProcessPayment(Ticket ticket){
        double amount = pricingStrategy.calculateAmount(ticket);

        System.out.println("Amount " + amount + " has been processed successfully");
    }
}

class CashPayment extends PaymentStrategy {

    public CashPayment(PricingStrategy pricingStrategy){
        super(pricingStrategy);
    }

    public void ProcessPayment(Ticket ticket){
        double amount = pricingStrategy.calculateAmount(ticket);

        System.out.println("Amount " + amount + " has been processed successfully");
    }
}