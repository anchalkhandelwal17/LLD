package lld.VendingMachine;

public class CancelledState implements State{

    @Override
    public void insertMoney(VendingMachine vendingMachine, int amount, PaymentStrategy paymentStrategy) {

    }

    @Override
    public void selectItem(VendingMachine vendingMachine, String rackId) {

    }

    @Override
    public void dispenseItem(VendingMachine vendingMachine) {

    }

    @Override
    public void cancelTransaction(VendingMachine vendingMachine) {
        vendingMachine.resetTransaction();
        vendingMachine.setVendingMachineState(new IdleState());
    }
}
