package africa.semicolon.data.repositories;

import africa.semicolon.data.models.User;

import java.util.ArrayList;

public class UserRepositoryImplementation implements UserRepository{

    ArrayList<User> users = new ArrayList<>();
    @Override
    public void save(User user) {
        users.add(user);

    }

    @Override
    public int getNoOfUsers(){
        return users.size();
    }
}
