package lld.VendingMachine;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Inventory {

    // maintains a list of inventory items
    private Map<String, Rack> racks;

    public Inventory(Map<String, InventoryItem> items) {
        this.racks = new HashMap<>();
    }

    public Map<String, Rack> getRacks() {
        return racks;
    }

    public Rack getRack(String rackId){
        return racks.get(rackId);
    }

    public void addItem(String rackId, InventoryItem inventoryItem){
        if(!racks.containsKey(rackId)){
            racks.put(rackId, new Rack(rackId));
        }

        racks.get(rackId).setInventoryItem(inventoryItem);
    }

    public void addStock(String rackId, int quantity){
        Rack rack = racks.get(rackId);
        rack.getInventoryItem().addStock(quantity);
    }

    public void decreaseStock(String rackId, int quantity){

        Rack rack = racks.get(rackId);
        rack.getInventoryItem().decreaseStock(quantity);
    }


}
