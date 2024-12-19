package testCalculator;

import calculations.ClassAccount;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ClassAccountTest {
    @Test
    public void getBalance() {
        ClassAccount account = new ClassAccount();
        account.deposit(1000);
        double balance = account.getBalance();
        assertEquals(1000, balance);

    }
    @Test
    public void testForNegativeDeposit() {
        ClassAccount account = new ClassAccount();
        assertThrows(IllegalArgumentException.class, () -> account.deposit(-500));
    }
@Test
    public void testForPositiveDeposit() {
        ClassAccount account = new ClassAccount();
        account.deposit(15000);
        assertEquals(account.getBalance(),15000);
}
@Test
    public void testForWithdrawal() {
        ClassAccount account = new ClassAccount();
        account.deposit(1000);
        account.withdraw(500);
        assertEquals(account.getBalance(),500);
}
@Test
    public void testForHigherWithdrawal() {
        ClassAccount account = new ClassAccount();
        account.deposit(1000);
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(5000));
}
@Test
    public void testForNegativeWithdrawal() {
        ClassAccount account = new ClassAccount();
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(-500));
}

}
