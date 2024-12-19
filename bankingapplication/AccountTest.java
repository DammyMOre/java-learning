package bankingapplication;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class AccountTest {

    Account account = new Account("Sera","1234","2024");

    @Test
    public void test_that_when_user_enter_a_name_getName_returns_the_name() {
        assertEquals("Sera",account.getName());
        account.setName("Praise");
        assertEquals("Praise",account.getName());
    }

    @Test
    public void test_that_when_user_enter_a_pin_getPin_returns_the_pin(){
        assertEquals("1234",account.getPin());

    }

    @Test
    public void test_that_when_user_enter_an_accountNumber_getAccountNumber_returns_the_accountNumber(){
        assertEquals("2024",account.getAccountNumber());
    }

    @Test
    public void test_that_user_can_deposit(){
        account.deposit(10);
        assertEquals(10,account.getBalance());
    }

    @Test
       public void test_that_user_can_withdraw(){

        account.withdraw(8, account.getPin());
            assertEquals(2,account.getBalance());
        }

    //    @Test
    //    public void test_that_User_cannot_deposit_a_negative_amount() {
    //        account.deposit(-10);
    //        assertEquals(-10, account.getBalance());
    //    }

    //    @Test
    //    public void test_that_user_can_withdraw(){
    //        account.withdraw(5);
    //        assertEquals(5,account.getBalance());
    //    }

    //  @Test
    // public double test_that_user_can_get_balance(){
    // return account.getBalance();
    // }

    //@Test
    // public void test_that_user_can_check_pin(){}

}