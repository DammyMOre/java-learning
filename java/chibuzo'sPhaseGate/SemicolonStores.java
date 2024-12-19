import java.util.Scanner;
import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;




public class SemicolonStore{
	public static void main(String... args){
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter Cashiers Name: ");
	String cashier = sc.nextLine();

	System.out.print("Enter Customer's Name: ");
	String customerName = sc.nextLine();

	//System.out.println("Cashier: " + cashier);
	//System.out.println("Customer's Name: " + customerName);

	
	count =0;
	do{
	System.out.println("What did the user buy: ");
	String product = sc.nextLine();

	System.out.println("How many pieces: ");
	int quantity = sc.nextInt();

	System.out.println("How much per unit: ");
	int price = sc.nextInt();
	}while (sc.hasNest());
	System.out.print("Add more Items? ");
	String answer = sc.nextLine();
	
	if(answer.equals("No")) break;
	
	System.out.println("  ");


	String storeDetails = """
			SEMICOLON STORES
			MAIN BRANCH
			LOCATION: 312,HERBERT MARCULAY WAY, SABO YABA, LAGOS.
			TEL: 03293828343
			""";

System.out.print(storeDetails);
			LocalDateTime dateAndTime = LocalDateTime.now();
			//LocalTime time = LocalTime.now();
System.out.println("DATE: " + dateAndTime);

	System.out.println("Cashier: " + cashier);
	System.out.println("Customer's Name: " + customerName);

	System.out.println("  ");



	
	System.out.println("==========================================================================");
       
System.out.println("             "+"ITEM"+ "    "+"QTY"+"     "+ "PRICE"+"       "+ "TOTAL(NGN)");

System.out.println("-------------------------------------------------------------------------");
	
System.out.printf("%15s%8d%10d%15d",product, quantity,price, price*quantity);


}




}