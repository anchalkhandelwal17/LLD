package lld.VendingMachine;

public class IdleState implements State{

    @Override
    public void insertMoney(VendingMachine vendingMachine, int amount, PaymentStrategy paymentStrategy) {
        paymentStrategy.handlePayment(amount);
        vendingMachine.setInsertedAmount(amount);
        vendingMachine.setVendingMachineState(new MoneyInsertedState());
    }

    @Override
    public void selectItem(VendingMachine vendingMachine, String rackId) {

    }

    @Override
    public void dispenseItem(VendingMachine vendingMachine) {

    }

    @Override
    public void cancelTransaction(VendingMachine vendingMachine) {

    }
}
