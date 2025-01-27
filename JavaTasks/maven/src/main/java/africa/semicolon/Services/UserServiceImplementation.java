package africa.semicolon.Services;

import africa.semicolon.data.models.User;
import africa.semicolon.data.repositories.UserRepository;
import africa.semicolon.data.repositories.UserRepositoryImplementation;

public class UserServiceImplementation implements UserServices{
    private UserRepository userRepository = new UserRepositoryImplementation();

    @Override
    public void register(String name, String email, String password) {
        User user = new User(name,email,password);
        user.setName(name);
        user.setEmail(email);
        user.setPassword(password);
        userRepository.save(user);


    }

    @Override
    public int getNoOfUsers() {
        return userRepository.getNoOfUsers();
    }


}
