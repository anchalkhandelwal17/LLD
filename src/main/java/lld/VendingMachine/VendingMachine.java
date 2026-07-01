package lld.VendingMachine;

import java.util.HashMap;
import java.util.Map;

public class VendingMachine {
    // will be having different racks containing items

    // rack -> inventoryItem -> item
    private Map<String, Rack> racks;
    private PaymentStrategy paymentStrategy;
    private int insertedAmount;
    private Item selectedItem = null;


    public int getInsertedAmount() {
        return insertedAmount;
    }

    public Item getSelectedItem() {
        return selectedItem;
    }

    private State state;

    public VendingMachine(){
        this.state = new IdleState();
    }

    public void setVendingMachineState(State vendingMachineState){
        this.state = vendingMachineState;
    }

    // insertMoney, selectItem, dispenseChange, dispenseItem, cancelTransaction

    public void insertMoney(int amount){
        setVendingMachineState(new MoneyInsertedState());
        this.insertedAmount += amount;
        paymentStrategy.handlePayment(amount);
        state.insertMoney(this);
    }

    public void selectItem(String rackId){
        this.selectedItem = racks.get(rackId).getInventoryItem().getItem();
        state.selectItem(this);
    }

    public void dispenseItem(){
        state.dispenseItem(this);
    }

    public void cancelTransaction(){
        state.cancelTransaction(this);
    }

}
