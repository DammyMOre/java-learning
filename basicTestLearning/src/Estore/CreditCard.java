package Estore;

public class CreditCard {
    private int cvv;
    private String expiryDate;
    private String number;
    private CardType type;

    public CreditCard(int cvv, String expiryDate, String number) {
        this.cvv = cvv;
        this.expiryDate = expiryDate;
        this.number = number;

    }

}
