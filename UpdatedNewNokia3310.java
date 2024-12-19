import java.util.Scanner;

public class NokiaUpdated{
	
	public static void main(String... args){

		nokiaMenu();


	}

public static void nokiaMenu(){	
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
		case 2:messages(); break;
		/*case 3:chat(); break;
		case 4:callRegister(); break;
		case 5:Tones(); break;*/
	}


}


public static void phonebook(){

	String phonebookMenu = """ 

		1. 	search
		2. 	Service Nos
		3. 	Add Name
		4. 	Erase
		5. 	Edit
		6. 	Assign Tone
		7. 	Send b' card
		8. 	Options
		9.	Speed dials
		10. 	Voice tag
		11. 	Go back to main menu


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

		case 8: options(); break;

		case 9:System.out.println("Speed dials"); break;
		
		case 10:System.out.println("Voice tags"); break;

		case 11: nokiaMenu(); break;

	}
}

public static void options(){

	String optionmenu = """ 

		1. 	Type of view
		2. 	Memory Status
		3. 	Back to previous menu
		4. 	Back to main menu

			""";

	System.out.print(optionmenu);
	Scanner input = new Scanner(System.in);

	System.out.print("enter a number: ");
	int options = input.nextInt();

	switch(options){
		case 1:System.out.println("Type of view"); break;
		case 2:System.out.println("Memory Status"); break;	
		case 3:phonebook(); break;
		case 4: nokiaMenu(); break;

	}

}

public static void messages(){

	String messageBookMenu = """

	1. Write messages
	2. inbox
	3. Outbox
	4. picture messages
	5. Templates
	6. Smileys
	7. Message Settings	
	8. Info Service
	9. voice mailbox number
	10. Service command Editor
	11. Back to mainMenu

""";

	System.out.print(messageBookMenu);
	Scanner input = new Scanner(System.in);
	System.out.print("enter a number: ");
	int message = input.nextInt();

	switch(message){
		case 1:System.out.println("Write a message");break;

		case 2:System.out.println("Inbox");break;

		case 3:System.out.println("Outbox");break;

		case 4:System.out.println("Picture messages");break;

		case 5:System.out.println("Templates");break;

		case 6:System.out.println("Smileys");break;

		case 7: messsageSettings();break;

		case 8:System.out.println("Smileys");break;

		case 9:System.out.println("Smileys");break;

		case 10:System.out.println("Smileys");break;

		case 11:nokiaMenu(); break;

	}
	} 

public static void messsageSettings(){

	String messsageSettingsMenu = """
	1. Set 1
	2. Common
	3. back to previousMenu
	4. back to mainMenu
	""";

	System.out.print(messsageSettingsMenu);
	Scanner input = new Scanner(System.in);
	System.out.print("enter a number: ");
	int seven = input.nextInt();

	switch(seven){

		case 1: set1(); break;
		case 2: common(); break;
		case 3: messages(); break;
		case 4: nokiaMenu(); break;
	
		
	}


}
	
public static void set1(){

	String set1Menu = """

		1.Message center number
		2. Message sent as
		3. Message validity
		4. back to previousMenu
		5. back to messageMenu
		6. back to mainMenu


	""";

	System.out.print(set1Menu);
	Scanner input = new Scanner(System.in);
	System.out.print("enter a number: ");
	int set = input.nextInt();
	
		switch(set){
		case 1:System.out.println("Message centre number");break;
		case 2:System.out.println("Message sent as");break;
		case 3:System.out.println("Message Validity");break;
		case 4: messsageSettings();break;
		case 5:	messages(); break;
		case 6: nokiaMenu(); break;

	
		}
		}
public static void common(){
 
	String commonMenu= """

		1. Delivery report
		2. Reply via same centre
		3. Character support
		4. back to previousMenu
		5. back to messageMenu
		6. back to mainMenu

	""";

		System.out.println(commonMenu);

		Scanner input = new Scanner(System.in);
		System.out.print("enter a number: ");
		int common = input.nextInt();

		switch(common){
		case 1:System.out.println("Delivery reports");break;
		case 2:System.out.println("Reply via same centre");break;
		case 3:System.out.println("Character supports");
		case 4: messsageSettings();break;
		case 5: messages(); break;
		case 6: nokiaMenu(); break;



		}
	    }

	}
