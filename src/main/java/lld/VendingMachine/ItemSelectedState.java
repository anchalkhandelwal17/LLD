package lld.VendingMachine;

public class ItemSelectedState implements State {

    @Override
    public void insertMoney(VendingMachine vendingMachine, int amount, PaymentStrategy paymentStrategy) {

    }

    @Override
    public void selectItem(VendingMachine vendingMachine, String rackId) {

    }

    @Override
    public void dispenseItem(VendingMachine vendingMachine) {
        Item item = vendingMachine.getSelectedItem();

        if (vendingMachine.getInsertedAmount() < item.getAmount()) {
            throw new IllegalStateException("Insufficient Balance");
        }

        vendingMachine.setVendingMachineState(new DispensingState());
        vendingMachine.dispenseItem();
    }

    @Override
    public void cancelTransaction(VendingMachine vendingMachine) {

    }
}
