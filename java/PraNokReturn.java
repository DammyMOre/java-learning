import java.util.Scanner;

public class PraNokReturn{

	public static void returnToMenu(){
	System.out.print(phoneMenu);
	}

public static void main(String... args){


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

case 1:System.out.println("Phone book");

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

		case 8:System.out.println("Options");

	
			System.out.print("enter a number: ");
			int options = input.nextInt();

		switch(options){
		case 1:System.out.println("Type of view");break;
		case 2:System.out.println("Memory Status");	
			}

		case 9:System.out.println("Speed dials"); break;
		case 10:System.out.println("Voice tags"); 		
		}


public static void goToMessages(){

String messageOptions="""

Messages

1. Write messages
2. Inbox
3. Outbox
4. picture messages
5. Templates
6. Smileys
7. Message settings
	1. Set 1
	  1. Message centre number
	  2. Messages sent as
	  3. Message validity
	2. Common
	  1. Delivery reports
	  2. Reply via same same centre
	  3. Character support
8. Info service
9. Voice mailbox number
10. Service command editor
0. Return to Menu

"""
		
	System.out.print("enter a number: ");
	int message = input.nextInt();

	switch(message){

case 2:System.out.println("Messages");

		case 1:System.out.println("Write a message");break;

		case 2:System.out.println("Inbox");break;

		case 3:System.out.println("Outbox");break;

		case 4:System.out.println("Picture messages");break;

		case 5:System.out.println("Templates");break;

		case 6:System.out.println("Smileys");break;

		case 7:System.out.println("Messsage settings");
		
	System.out.print("enter a number: ");
	int seven = input.nextInt();

		switch(seven){
		case 1:System.out.println("Set 1");
		System.out.print("enter a number: ");
		int set1 = input.nextInt();
	
		switch(set1){
	case 1:System.out.println("Message centre number");break;
	case 2:System.out.println("Message sent as");break;
		case 3:System.out.println("Message Validity");	
		}

		case 2:System.out.println("Common");
		int common = input.nextInt();

	

		switch(common){
	case 1:System.out.println("Delivery reports");break;
	case 2:System.out.println("Reply via same centre");break;
		case 3:System.out.println("Character supports");
		}
	     }
	case 8:System.out.println("Info service");break;
	case 9:System.out.println("Voice mailbox number");break;
case 10:System.out.println("Service command editor");break;
	case 0:returnToMenu();break;
}
}   

