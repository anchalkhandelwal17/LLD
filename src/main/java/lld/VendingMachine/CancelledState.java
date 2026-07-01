package lld.VendingMachine;

public class CancelledState implements State{
    @Override
    public void insertMoney(VendingMachine vendingMachine) {

    }

    @Override
    public void selectItem(VendingMachine vendingMachine) {

    }

    @Override
    public Item dispenseItem(VendingMachine vendingMachine) {
        return null;
    }

    @Override
    public void cancelTransaction(VendingMachine vendingMachine) {

    }
}
