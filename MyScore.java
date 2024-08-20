import java.util.Scanner;

public class MyScore{

public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);

	int passmark = 50;
	int totalpass = 0;
	int totalfail = 0;
	
	for(int count =1; count<=10;count+=1){
		System.out.print("what is your score: ");
	  int number = scanner.nextInt();
		
		if (number < passmark) {
		System.out.println("fail");
		totalfail+=1;
		}

		if (number >= passmark) {
		System.out.println("Pass");
		totalpass+=1;
		}
		
	  
	}

}

}

		