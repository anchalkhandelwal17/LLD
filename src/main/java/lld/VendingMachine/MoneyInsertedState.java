package lld.VendingMachine;

public class MoneyInsertedState implements State{
    @Override
    public void insertMoney(VendingMachine vendingMachine) {
        vendingMachine.setVendingMachineState(new ItemSelectedState());
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
