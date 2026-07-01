package lld.VendingMachine;

public class ItemSelectedState implements State{
    @Override
    public void insertMoney(VendingMachine vendingMachine) {

    }

    @Override
    public void selectItem(VendingMachine vendingMachine) {
        int change = vendingMachine.getSelectedItem().getAmount() - vendingMachine.getInsertedAmount();

        if(change < 0){
            vendingMachine.setVendingMachineState(new IdleState());
            return;
        }
        vendingMachine.setVendingMachineState(new DispensingState());
    }

    @Override
    public Item dispenseItem(VendingMachine vendingMachine) {
        return null;
    }

    @Override
    public void cancelTransaction(VendingMachine vendingMachine) {

    }
}
