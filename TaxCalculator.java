import java.util.Scanner;
public class TaxCalculator{

public static void main(String... args){
Scanner scanner = new Scanner(System.in);

double taxRateForEarningsBelowThirtyThousand = 0.15;
double taxRateForEarningsAboveThirtyThousand = 0.20;
double tax;
for(int count = 1; count<=3; count++){

System.out.println("Enter your name: ");
String name = scanner.nextLine();

System.out.println("Enter earnings: ");
int earnings = scanner.nextInt();
scanner.nextLine();


if(earnings <= 30000){
tax = taxRateForEarningsBelowThirtyThousand * earnings;
System.out.println(tax);
}

else if(earnings >= 30000){
tax = taxRateForEarningsAboveThirtyThousand * earnings;
System.out.println(tax);

}

}


}
}

