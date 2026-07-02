package lld.VendingMachine;

public interface State {
    // ready, dispenseChange, dispenseItem, transaction cancelled state

     void insertMoney(VendingMachine vendingMachine, int amount, PaymentStrategy paymentStrategy);
     void selectItem(VendingMachine vendingMachine, String rackId);
     void dispenseItem(VendingMachine vendingMachine);
     void cancelTransaction(VendingMachine vendingMachine);

}
