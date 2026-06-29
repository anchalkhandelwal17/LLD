package lld.InventoryManagementSystem;

public class InventoryMain {
    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        // create products
        Product p1 = ProductFactory.createProduct(1, "iphone", 8000, Category.ELECTRONIC);
        Product p2 = ProductFactory.createProduct(2, "headphones", 10000, Category.ELECTRONIC);
        Product p3 = ProductFactory.createProduct(3, "shirt", 3000, Category.CLOTH);
        Product p4 = ProductFactory.createProduct(4, "jeans", 3000, Category.CLOTH);
        Product p5 = ProductFactory.createProduct(5, "rice", 500, Category.GROCERY);

        // InventoryItems

        InventoryItem inventoryItem1 = new InventoryItem(p1, 10, 5);
        InventoryItem inventoryItem2 = new InventoryItem(p2, 15, 7);
        InventoryItem inventoryItem3 = new InventoryItem(p3, 25, 8);
        InventoryItem inventoryItem4 = new InventoryItem(p4, 20, 6);
        InventoryItem inventoryItem5 = new InventoryItem(p5, 50, 15);

        inventory.addProduct(p1.getProductId(), inventoryItem1);
        inventory.addProduct(p2.getProductId(), inventoryItem2);
        inventory.addProduct(p3.getProductId(), inventoryItem3);
        inventory.addProduct(p4.getProductId(), inventoryItem4);
        inventory.addProduct(p5.getProductId(), inventoryItem5);

        Supplier supplier = new Supplier(100, "abc", 123908, new GeneralReplenishmentStrategy());

        inventory.addObservers(supplier);

        inventory.decreaseStock(1, 7);
        System.out.println(inventory.getItems().get(p1.getProductId()).getQuantity());
        inventory.addStock(2, 3);

    }
}
