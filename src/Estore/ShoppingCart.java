package Estore;

import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Item> items;

    public ShoppingCart() {
        this.items = new ArrayList<Item>();
    }
    public void addItems(Item item) {
        this.items.add(item);
    }
    public void removeItems(Item item) {
        this.items.remove(item);
    }

}
