package calculations;

public class Library {
    private String name;
    private String password;
    private String email;
    private String address;
    private boolean isActive;
    private boolean isLogin;
    public Library(String name, String password, String email, String address, boolean isActive, boolean isLogin) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.address = address;
        this.isActive = isActive;
        this.isLogin = isLogin;
    }
    public String getName() {
        return name;
    }
    public String getPassword() {
        return password;
    }
    public String getEmail() {
        return email;
    }
    public String getAddress() {
        return address;
    }
    public boolean isActive() {
        return isActive;
    }
    public boolean isLogin() {
        return isLogin;
    }
   // public String setBorrowedBook(String name) {

    //}
}

