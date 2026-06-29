package lld.InventoryManagementSystem;

public interface ReplenishmentStrategy {

    void reFillProduct(InventoryItem inventoryItem);
}

class BulkReplenishmentStrategy implements ReplenishmentStrategy{

    @Override
    public void reFillProduct(InventoryItem inventoryItem) {

        int refillQuantity = 50;
        inventoryItem.addStock(refillQuantity);

        System.out.println("Total " + refillQuantity + " units added in stock for product: "
        + inventoryItem.getProduct().getProductName());
    }
}

class GeneralReplenishmentStrategy implements ReplenishmentStrategy{


    @Override
    public void reFillProduct(InventoryItem inventoryItem) {

        int refillQuantity = 10;
        inventoryItem.addStock(refillQuantity);

        System.out.println("Total " + refillQuantity + " units added in stock for product: "
                + inventoryItem.getProduct().getProductName());
    }
}