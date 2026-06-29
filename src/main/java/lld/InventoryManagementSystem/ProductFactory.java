package lld.InventoryManagementSystem;

public class ProductFactory {

    public static Product createProduct(int id, String name, double price, Category productType){

        switch (productType) {

            case CLOTH, GROCERY, ELECTRONIC -> {
                return new Product(id, name, price);
            }

            case OTHER -> {
                return new Product(id, name, price+1000);
            }

            default -> {
                throw new IllegalArgumentException("Invalid Product Type.");
            }
        }
    }
}
