package lld.VendingMachine;

// Using factory here is exactly not relevant, but just for the simplicity of creating products using it
public class ItemFactory {
    static int counter = 0;
    public static Item createItem(Category category){
        switch (category){
            case CHIPS -> {
                return new Item("chips" + ++counter, 20, Category.CHIPS);
            }
            case JUICE -> {
                return new Item("juice" + ++counter, 30, Category.JUICE);
            }
            case CHOCOLATE -> {
                return new Item("chocolate" + ++counter, 50, Category.CHOCOLATE);
            }
            case WATER -> {
                return new Item("water" + ++counter, 20, Category.WATER);
            }

            default -> new IllegalArgumentException("Please provide valid input");
        }
        return null;
    }
}
