package Estore;

public class Billing {
    private String phoneNumber;
    private String name;
    private Address address;
    private CreditCard creditcard;
    public Billing(String phoneNumber, String name, Address address, CreditCard creditcard) {
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.address = address;
        this.creditcard = creditcard;
    }

}
