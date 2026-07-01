package lld.VendingMachine;

public interface PaymentStrategy {
    void handlePayment(int amount);
}


class insertCoin implements PaymentStrategy{

    @Override
    public void handlePayment(int amount) {
        // logic to handle payment
        System.out.println("Amount received: " + amount + " via coins");
    }
}

class insertNote implements PaymentStrategy{

    @Override
    public void handlePayment(int amount) {
        // logic to handle payment
        System.out.println("Amount received: " + amount + " via notes");
    }
}

class insertUPIPayment implements PaymentStrategy{

    @Override
    public void handlePayment(int amount) {
        // logic to handle payment
        System.out.println("Amount received: " + amount + " via UPI");
    }
}