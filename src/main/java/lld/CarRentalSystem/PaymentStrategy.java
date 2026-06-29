package lld.CarRentalSystem;

public interface PaymentStrategy {

    void makePayment(double amount);
}

// cash, upi, card

class CashPayment implements PaymentStrategy{

    @Override
    public void makePayment(double amount) {
        System.out.println("Payment of amount: " + amount + " has been successfully processed via cash " +
                "and car has been returned");
    }
}

class UPIPayment implements PaymentStrategy{

    @Override
    public void makePayment(double amount) {
        System.out.println("Payment of amount: " + amount + " has been successfully processed via upi " +
                "and car has been returned");
    }
}

class CardPayment implements PaymentStrategy{

    @Override
    public void makePayment(double amount) {
        System.out.println("Payment of amount: " + amount + " has been successfully processed via card " +
                "and car has been returned");
    }
}