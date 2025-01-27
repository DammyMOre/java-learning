package Estore;

import java.util.ArrayList;
import java.util.List;

public class Item {
    private List<Product> product;
    private int quantity;

    public Item( Product product, int quantity) {
        this.product = new ArrayList<>();
        this.quantity = quantity;

    }
}
