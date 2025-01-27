package chaper1test;

import calculations.PetrolPurchase;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PetrolPurchaseTest {
    @Test
    public void testThatUserCanGetStationLocation() {
        PetrolPurchase petrol = new PetrolPurchase();
        petrol.setLocation("yaba");
       String expected = petrol.getLocation();
       assertEquals(expected,"yaba");
    }

    @Test
    public void testThatUserCanGetTypeOfPetrol() {
        PetrolPurchase petrol = new PetrolPurchase();
        petrol.setTypeOfPetrol("Diesel");
        String expected = petrol.getTypeOfPetrol();
        assertEquals(expected,"Diesel");
    }
    @Test
    public void testThatUserCanGetQuantityOfPurchase() {
        PetrolPurchase petrol = new PetrolPurchase();
        petrol.setQuantityOfPurchase(5);
        int expected = petrol.getQuantityOfPurchase();
        assertEquals(expected,5);
    }
    @Test
    public void testPercentageDiscount() {
        PetrolPurchase petrol = new PetrolPurchase();
        petrol.setPercentageDiscount(90000.00,0);
        double expected = petrol.getPercentageDiscount();
        assertEquals(expected,0.00);
    }
}
