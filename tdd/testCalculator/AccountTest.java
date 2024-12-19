package testCalculator;

import calculations.Account;
import calculations.exceptions.InvalidAmountException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AccountTest {

    @Test
    public void testThatUserCanGetAccountName() {
       Account account = new Account();
        account.setName("c22");
        String expected = account.getName();
        assertEquals(expected,"c22");
    }
    @Test
    public void testThatUserCanGetAccountNumber() {
        Account account = new Account("9990","jack");
       account.setAccountNumber("9090");
        String expected = account.getAccountNumber();
        assertEquals("9090",expected);
    }
    @Test
    public void testUserCanDeposit(){
        Account account = new Account();
        account.deposit(90000.00);
        double balance = account.getBalance();
        assertEquals(90000.00,balance);
    }
    @Test
    public void testUserCanWithdraw(){
        Account account = new Account();
        account.deposit(10000.00);
       assertThrows(InvalidAmountException.class, ()-> account.withdraw(50000.00));

    }
    @Test
    public void testUserCanGetPin(){
        Account account = new Account();
        account.setPin("1234");
        String expected = account.getPin();
        assertEquals("1234",expected);

    }
    @Test
    public void testUserCanSetAddress(){
        Account account = new Account();
        account.setAddress("12,herbert marculey way lagos");
        String expected = account.getAddress();
        assertEquals("12,herbert marculey way lagos",expected);

    }
}


