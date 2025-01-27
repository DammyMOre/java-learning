package calculations;
import java.security.SecureRandom;

public class Random {
    public static void main(String[] args) {
        SecureRandom sr = new SecureRandom();
        for (int count = 0; count <= 20; count++) {
            int face = sr.nextInt(6);
            System.out.printf("%d" , face );
            if(count % 4 ==0){

                System.out.println();
            }


        }
    }
}
