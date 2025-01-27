package Estore;

import java.util.ArrayList;

public class Customer extends User {
    private ArrayList<Billing> billing;

    private ShoppingCart shoppingCart;

    public Customer(int age, String email, Address address, String name, String password, int phoneNumber) {
        super(age, email, address, name, password, phoneNumber);
        this.billing = new ArrayList<>();
        this.shoppingCart = new ShoppingCart();

    }
}
