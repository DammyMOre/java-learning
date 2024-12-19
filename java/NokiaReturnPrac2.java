import java.util.Scanner;

public class NokiaReturnPrac2{
	
	public static void main(String... args){
	returnToMenu();

	}

	public static void returnToMenu(){

	String Menu = """
	
	PHONE MENU

	1- Phone book

	2- Messages

	3- Chat
	
	4- Call register
	
	5- Tones 

	6- Settings
	
	7- Call Divert

	8- Games

	9- Calculator 

	10- Reminders

	11- Clock

	12- Profiles

	13- SIM Services

	""";

	System.out.print(Menu);
	Scanner input = new Scanner(System.in);
	System.out.print("enter a number: ");
	int enter = input.nextInt();
		
	switch(enter){
		case 1:phonebook(); break;

		/*case 2:Messages(); break;

		case 3:System.out.println("Chat");break;

		case 4:Call Register();break;

		case 5:Tones();break;

		case 6:Settings();break;

		case 7:System.out.println("Call Divert");break;
		
		case 8:System.out.println("Games");break;

		case 9:System.out.println("Calculator") ;break;

		case 10:System.out.println("Reminders");break;

		case 11:Clock();break;

		case 12:System.out.println("Profiles");break;

		case 13:System.out.println("SIM Services");break;*/
}
	
}

public static void phonebook(){

String phonebookMenu = """
List of options in Phone book

1. Search
2. Service Nos
3. Add name
4. Erase
5. Edit
6. Assign tone
7. Send b' card
8. Options
	1. Type of view
	2. Memory Status
9. Speed dials
10. Voice tags
0. Back to main menu

""";
		System.out.print(phonebookMenu);
		Scanner input = new Scanner(System.in);
		System.out.print("enter a number: ");
		int response = input.nextInt();

		switch(response){

		case 1:System.out.println("Search");break;

		case 2:System.out.println("Service Nos");break;

		case 3:System.out.println("Add name");break;

		case 4:System.out.println("Erase");break;

		case 5:System.out.println("Edit");break;

		case 6:System.out.println("Assign tone");break;

		case 7:System.out.println("Send b'card");break;

		case 8: option(); break;
		case 9:System.out.println("Speed dials"); break;
		case 10:System.out.println("Voice tags"); break;
		case 0: returnToMenu();
		default: System.out.print("Invalid Input");
		}


	
}


public static void option(){

	String optionMenu = """
	1. Type of view
	2. Memory Status
	0. Back to previous menu
		""";
System.out.print(optionMenu);
Scanner input = new Scanner(System.in);
System.out.print("enter option: ");
int options = input.nextInt();

	switch(options){
	case 1:System.out.println("Type of view");break;
	case 2:System.out.println("Memory Status");
	case 0:	phonebook(); break;
	default: System.out.print("Invalid Input");
	}

	}











}