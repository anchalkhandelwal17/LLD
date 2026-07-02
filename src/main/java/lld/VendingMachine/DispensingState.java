package lld.VendingMachine;

public class DispensingState implements State{

    @Override
    public void insertMoney(VendingMachine vendingMachine, int amount, PaymentStrategy paymentStrategy) {

    }

    @Override
    public void selectItem(VendingMachine vendingMachine, String rackId) {

    }

    @Override
    public void dispenseItem(VendingMachine vendingMachine) {

        InventoryItem inventoryItem = vendingMachine.getSelectedRack().getInventoryItem();

        inventoryItem.decreaseStock(1);

        int change = vendingMachine.getInsertedAmount() - vendingMachine.getSelectedItem().getAmount();

        System.out.println("Dispensing Item...");

        System.out.println("Returning Change: " + change);

        vendingMachine.resetTransaction();

        vendingMachine.setVendingMachineState(new IdleState());
    }

    @Override
    public void cancelTransaction(VendingMachine vendingMachine) {
        System.out.println("Cannot cancel now already in dispensing state");
    }
}
