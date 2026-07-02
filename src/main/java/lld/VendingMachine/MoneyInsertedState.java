package lld.VendingMachine;

public class MoneyInsertedState implements State{

    @Override
    public void insertMoney(VendingMachine vendingMachine, int amount, PaymentStrategy paymentStrategy) {

    }

    @Override
    public void selectItem(VendingMachine vendingMachine, String rackId) {
        Rack rack = vendingMachine.getInventory().getRack(rackId);

        if(rack == null){
            throw new IllegalArgumentException();
        }

        vendingMachine.setSelectedRack(rack);
        vendingMachine.setSelectedItem(rack.getInventoryItem().getItem());

        vendingMachine.setVendingMachineState(new ItemSelectedState());

    }

    @Override
    public void dispenseItem(VendingMachine vendingMachine) {

    }

    @Override
    public void cancelTransaction(VendingMachine vendingMachine) {

    }
}
