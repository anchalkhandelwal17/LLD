package lld.InventoryManagementSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Inventory {
    // stores a list of all the products
    // maintain observers as well for stock replenishment

    private Map<Integer, InventoryItem> items = new HashMap<>();

    private List<InventoryObserver> inventoryObservers = new ArrayList<>();

    public Map<Integer, InventoryItem> getItems() {
        return items;
    }

    public List<InventoryObserver> getInventoryObservers() {
        return inventoryObservers;
    }

    // getProduct, checkAvailability, notifyObserver, addProduct

    public void addProduct(int productId, InventoryItem inventoryItem){
        items.put(productId, inventoryItem);
    }

    public void addObservers(InventoryObserver observer){
        inventoryObservers.add(observer);
    }


    public Product getProduct(int productId){
        return items.get(productId).getProduct();
    }

    public boolean checkAvailability(int productId){
        if(items.containsKey(productId)){
            if(items.get(productId).getQuantity() > 0){
                return true;
            }
        }
        return false;
    }

    public void addStock(int productId, int quantity){
        InventoryItem item = items.get(productId);

        item.addStock(quantity);
    }

    public void decreaseStock(int productId, int quantity){
        InventoryItem item = items.get(productId);

        item.decreaseStock(quantity);

        if(item.getQuantity() < item.getReorderLevel()){
            notifyObserver(item);
        }
    }

    public void notifyObserver(InventoryItem item){

        for(InventoryObserver observer : inventoryObservers){
            observer.update(item);
        }
    }

}
