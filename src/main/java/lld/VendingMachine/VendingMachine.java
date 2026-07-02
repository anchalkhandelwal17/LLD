package lld.VendingMachine;

import java.util.HashMap;
import java.util.Map;

public class VendingMachine {
    // will be having different racks containing items

    // rack -> inventoryItem -> item
    private Inventory inventory;
    private PaymentStrategy paymentStrategy;
    private int insertedAmount;
    private Item selectedItem = null;
    private Rack selectedRack = null;

    public Map<String, Rack> getRacks() {
        return inventory.getRacks();
    }

    public Rack getSelectedRack() {
        return selectedRack;
    }

    public void setSelectedRack(Rack rack) {
        this.selectedRack = selectedRack;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public PaymentStrategy getPaymentStrategy() {
        return paymentStrategy;
    }

    public int getInsertedAmount() {
        return insertedAmount;
    }

    public Item getSelectedItem() {
        return selectedItem;
    }

    public void setSelectedItem(Item selectedItem) {
        this.selectedItem = selectedItem;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public void setInsertedAmount(int insertedAmount) {
        this.insertedAmount = insertedAmount;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    private State state;

    public VendingMachine(){
        this.state = new IdleState();
    }

    public void setVendingMachineState(State vendingMachineState){
        this.state = vendingMachineState;
    }

    // insertMoney, selectItem, dispenseChange, dispenseItem, cancelTransaction

    public void insertMoney(int amount, PaymentStrategy paymentStrategy){
        state.insertMoney(this, amount, paymentStrategy);
    }

    public void selectItem(String rackId){
        state.selectItem(this, rackId);
    }

    public void dispenseItem(){
        state.dispenseItem(this);
    }

    public void cancelTransaction(){
        state.cancelTransaction(this);
    }

    public void resetTransaction() {
        insertedAmount = 0;
        selectedItem = null;
        selectedRack = null;
    }

}
