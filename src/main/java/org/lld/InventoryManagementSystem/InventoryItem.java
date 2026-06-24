package org.lld.InventoryManagementSystem;

public class InventoryItem {

    // product, quantity, reorderLevel;

    private Product product;
    private int quantity;
    private int reorderLevel;

    public InventoryItem(Product product, int quantity, int reorderLevel) {
        this.product = product;
        this.quantity = quantity;
        this.reorderLevel = reorderLevel;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getReorderLevel() {
        return reorderLevel;
    }

    // addStock, decreaseStock

    public void addStock(int quantity){

        this.quantity += quantity;
    }

    public void decreaseStock(int quantity){

//        if(quantity < this.quantity){
//            throw  new IllegalArgumentException("decrease quantity cannot be less than the current quantity");
//        }

        this.quantity -= quantity;
    }
}
