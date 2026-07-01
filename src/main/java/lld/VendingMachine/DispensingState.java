package lld.VendingMachine;

public class DispensingState implements State{
    @Override
    public void insertMoney(VendingMachine vendingMachine) {

    }

    @Override
    public void selectItem(VendingMachine vendingMachine) {

    }

    @Override
    public Item dispenseItem(VendingMachine vendingMachine) {
        vendingMachine.setVendingMachineState(new IdleState());
        return vendingMachine.getSelectedItem();
    }

    @Override
    public void cancelTransaction(VendingMachine vendingMachine) {

    }
}
