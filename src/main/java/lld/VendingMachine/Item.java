package lld.VendingMachine;

import java.util.UUID;

public class Item {
    private String itemId;
    private String name;
    private int amount;
    private Category category;

    public Item(String name, int amount, Category category) {
        this.itemId = UUID.randomUUID().toString();
        this.name = name;
        this.amount = amount;
        this.category = category;
    }

    public String getItemId() {
        return itemId;
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
