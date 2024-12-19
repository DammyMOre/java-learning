package bankingapplication.exceptions;

public class InvalidWithdrawalException extends RuntimeException{
    public InvalidWithdrawalException(String insufficientBalance) {
        super(insufficientBalance);
    }
}
