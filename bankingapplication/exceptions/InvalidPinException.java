package bankingapplication.exceptions;

public class InvalidPinException extends RuntimeException {
    public InvalidPinException(String pleaseEnterAValidPin) {
        super(pleaseEnterAValidPin);
    }
}
