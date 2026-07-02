package lld.VendingMachine;

public class Rack {
    private String rackId;
    private InventoryItem inventoryItem;

    public Rack(String rackId) {
        this.rackId = rackId;
    }

    public void setInventoryItem(InventoryItem inventoryItem) {
        this.inventoryItem = inventoryItem;
    }

    public String getRackId() {
        return rackId;
    }

    public InventoryItem getInventoryItem() {
        return inventoryItem;
    }

    public void addInventoryItem(InventoryItem inventoryItem){
        this.inventoryItem = inventoryItem;
    }

    public void removeInventoryItem(){
        this.inventoryItem = null;
    }
}
