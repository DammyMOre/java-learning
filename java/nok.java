import java.util.Scanner;

public class Nok{
	
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

	13- SIM Servicess

	

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
	case 10:System.out.println("Voice tags"); break;		
	}
	

	case 2:System.out.println("Messages");	
	System.out.print("enter a number: ");
	int message = input.nextInt();
	
	switch(message){
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
	case 3:System.out.println("Character supports");break;
	}
     }
  }

	case 3:System.out.println("Chat");break;
	
	case 4:System.out.println("Call register");break;

	
	case 5:System.out.println("Tones");break;


	case 6:System.out.println("Settings");break;

	
	case 7:System.out.println("Call Divert");break;


	case 8:System.out.println("Games");break;


	case 9:System.out.println("Calculator") ;break;


	case 10:System.out.println("Reminders");break;


	case 11:System.out.println("Clock");break;


	case 12:System.out.println("Profiles");break;


	case 13:System.out.println("SIM Services");break;


	}






	

}
}