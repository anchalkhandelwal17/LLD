package lld.VendingMachine;

public class Item {
    private String name;
    private int amount;
    private Category category;

    public Item(String name, int amount, Category category) {
        this.name = name;
        this.amount = amount;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public Category getCategory() {
        return category;
    }
}
