import java.util.Scanner;
import java.time.LocalDate;

public class TestMenstrutionApp{

public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);
	System.out.print("enter date in this format (YY-MM-DD): ");
	String date = scanner.nextLine();

	LocalDate localDate = LocalDate.parse(date);

	System.out.print(localDate);
}
}