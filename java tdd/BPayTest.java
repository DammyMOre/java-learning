import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BPayTest{
	

	@Test
	public void testCanDepositIntoaccount(){

	//Given
	double amountToDeposit = 350_000;
	Account account = new Account();
	//When
	account.deposit(amountToDeposit);
	//check
	double balance = account.getBalance();
	double expectedBalance = 350_000;
	assertEquals(expectedBalance, balance);
}


	@Test
	public void testNegativeDeositAmountThrowsException(){

		//Given
		double amountToDeposit = -100_000;
		Account account = new Account();

		//when and check

		assertThrows(IllegalArgumentException.class, 
			()->account.deposit(amountToDeposit));
		

}

@Test
public void testCanTransferFunds(){

	//Given
	double amountToDeposit = 10_000;
	Account sender = new Account();
	Account recipient = new Account();
	sender.deposit(amountToDeposit);
	//when
	double transferAmount = 2_250;
	sender.transferFunds(transferAmount, recipient);
	//check
	double recipientBalance = recipient.getBalance();
	assertEquals(transferAmount, recipientBalance);
        double senderBalance = sender.getBalance();
        assertEquals(amountToDeposit - transferAmount, senderBalance);
	

}

@Test
public void testInsufficientBalance(){
	//Given
	double amountToDeposit = 10_000;
	Account sender = new Account();
	Account recipient = new Account();
	sender.deposit(amountToDeposit);

	//when
	double transferAmount = 25000;
	sender.transferFunds(transferAmount, recipient);


	//check


}

}