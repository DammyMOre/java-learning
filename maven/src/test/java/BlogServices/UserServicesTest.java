package BlogServices;

import africa.semicolon.Services.UserServiceImplementation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserServicesTest {
    @Test
    public void testUserCanRegister() {
        UserServiceImplementation userServices = new UserServiceImplementation();
        userServices.register("dammy", "dammy@yahoo.com", "password");
        assertEquals(1, userServices.getNoOfUsers());

    }

    @Test
    public void testThatUserCanRegisterTwoAccounts() {
        UserServiceImplementation userServices = new UserServiceImplementation();
        userServices.register("dammy", "dammy@yahoo.com", "password");
        userServices.register("tobi", "tobi@yahoo.com", "password");
        assertEquals(2, userServices.getNoOfUsers());

    }
}