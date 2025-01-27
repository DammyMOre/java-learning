package africa.semicolon.data.repositories;

import africa.semicolon.data.models.User;

public interface UserRepository {
    void save(User user);
    int getNoOfUsers();
}
