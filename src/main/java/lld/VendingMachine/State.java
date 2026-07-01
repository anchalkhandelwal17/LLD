package lld.VendingMachine;

public interface State {
    // ready, dispenseChange, dispenseItem, transaction cancelled state

     void insertMoney(VendingMachine vendingMachine);
     void selectItem(VendingMachine vendingMachine);
     Item dispenseItem(VendingMachine vendingMachine);
     void cancelTransaction(VendingMachine vendingMachine);

}
