package africa.semicolon.Services;

public interface UserServices {
    void register(String name, String email, String password);

    int getNoOfUsers();
}
