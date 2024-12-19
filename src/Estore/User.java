package Estore;

public class User {
    private int age;
    private String email;
    private Address address;
    private String name;
    private String password;
    private int phoneNumber;


    public User(int age, String email, Address address, String name, String password, int phoneNumber) {
        this.age = age;
        this.email = email;
        this.address = address;
        this.name = name;
        this.password = password;
        this.phoneNumber = phoneNumber;

    }

}
