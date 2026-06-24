package org.lld.InventoryManagementSystem;

public class Supplier implements InventoryObserver{

    private int supplierId;
    private String supplierName;
    private int contactInfo;


    private ReplenishmentStrategy replenishmentStrategy;

    public Supplier(int supplierId, String supplierName, int contactInfo, ReplenishmentStrategy replenishmentStrategy) {
        this.supplierId = supplierId;
        this.supplierName = supplierName;
        this.contactInfo = contactInfo;
        this.replenishmentStrategy = replenishmentStrategy;
    }

    @Override
    public void update(InventoryItem inventoryItem) {
        replenishmentStrategy.reFillProduct(inventoryItem);

    }

}
