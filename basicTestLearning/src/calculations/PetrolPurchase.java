package calculations;

import java.util.Scanner;



public class PetrolPurchase {
    final String LOCATION = "412 EMMANUEL LANE YABA, LAGOS STATE";
    private String location = LOCATION;
    private String typeOfPetrol;
    private int quantityOfPurchase;
    private double priceOfPetrol;
    private double percentageDiscount;


    public PetrolPurchase(String location, String typeOfPetrol, int quantityOfPurchase, double price, double percentageDiscount) {
        this.location = location;
        this.typeOfPetrol = typeOfPetrol;
        this.quantityOfPurchase = quantityOfPurchase;
        this.priceOfPetrol = priceOfPetrol;
        this.percentageDiscount = percentageDiscount;

    }

    public PetrolPurchase() {

    }

    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }

    public String getTypeOfPetrol() {
        return typeOfPetrol;
    }
    public void setTypeOfPetrol(String typeOfPetrol) {
        this.typeOfPetrol = typeOfPetrol;
    }

    public int getQuantityOfPurchase() {
        return quantityOfPurchase;
    }
    public void setQuantityOfPurchase(int quantityOfPurchase) {
        this.quantityOfPurchase = quantityOfPurchase;
    }

    public double getPriceOfPetrol() {
        return priceOfPetrol;
    }
    public void setPriceOfPetrol(double priceOfPetrol) {
        this.priceOfPetrol = priceOfPetrol;
    }

    public double getPercentageDiscount() {
        return percentageDiscount;
    }
    public void setPercentageDiscount(double price, int percentageDiscount) {
        double percentageDiscountPrice = (double) percentageDiscount /100;
        if(percentageDiscountPrice > 0) {
            percentageDiscountPrice = percentageDiscountPrice * price;
            this.percentageDiscount = percentageDiscountPrice;
        }
        else {
            this.percentageDiscount = 0;
        }

    }

    public int getPurchasesAmount() {
       double netAmount = (quantityOfPurchase * priceOfPetrol) - percentageDiscount;
         return (int) netAmount;
    }
}
