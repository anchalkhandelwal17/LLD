package lld.VendingMachine;

public class InventoryItem {
    private Item item;
    private int quantity;

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // addStock, decreaseStock

    public void addStock(int quantity){
        this.quantity += quantity;
    }

    public void decreaseStock(int quantity){
        if(this.quantity < quantity)
            throw new IllegalStateException();
        this.quantity -= quantity;
    }
}
