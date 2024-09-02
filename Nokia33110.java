import java.util.Scanner;

public class PraNokia{
	
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
		case 10:System.out.println("Voice tags"); break;		
		}


		System.out.print("enter a number: ");
	
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
		case 3:System.out.println("Character supports");
		}
	     }
  	}

case 3:System.out.println("Chat");break;


	
case 4:System.out.println("Call register");

	System.out.print("enter a number: ");
	int callRegister = input.nextInt();
	
	switch(callRegister){
	case 1:System.out.println("Missed Calls");break;
	case 2:System.out.println("Recieved calls");break;
	case 3:System.out.println("Dialled Numbers");break;
	case 4:System.out.println("Erase recent call lists");break;
	case 5:System.out.println("Show call duration");


	System.out.print("enter a number: ");
	int duration = input.nextInt();

		switch(duration){
		case 1:System.out.println("Last call duration");break;
		case 2:System.out.println("All call's duration");	
		case 3:System.out.println("Recieved call's duration");	
		case 4:System.out.println("Dialled calls duration");break;
		case 5:System.out.println("Clear timers");break;
		}

	case 6:System.out.println("Show call cost");

		System.out.print("enter a number: ");
		int cost= input.nextInt();
	 
		switch(cost){
		case 1:System.out.println("last call cost");break;
		case 2:System.out.println("All cost cost");break;
		case 3:System.out.println("Clear counters");
		}

	case 7:System.out.println("Call cost settings");

		System.out.print("enter a number: ");
		int costSetting= input.nextInt();
	 
		switch(costSetting){
		case 1:System.out.println("call cost limit");break;
		case 2:System.out.println("Show costs in");
		}

	case 8:System.out.println("Prepaid credit");break;

	}
	
case 5:System.out.println("Tones");

	System.out.print("enter a number: ");
	int tones = input.nextInt();
	
	switch(tones){
	case 1:System.out.println("Ringing Tone");break;

	case 2:System.out.println("Ringing volume");break;

	case 3:System.out.println("Incoming call alert");break;

	case 4:System.out.println("Composer");break;

	case 5:System.out.println("Message aleart tone");break;

	case 6:System.out.println("Keypad tones");break;

	case 7:System.out.println("Warning and game tones");break;

	case 8:System.out.println("Vibrating alert");break;

	case 9:System.out.println("Screen saver");
  	} 
	
case 6:System.out.println("Settings");

	System.out.print("enter a number: ");
	int settings = input.nextInt();

	switch(settings){
	case 1:System.out.println("Call settings");

		System.out.print("enter a number: ");
		int callSet = input.nextInt();

		switch(callSet){
		case 1:System.out.println("Automatic redial");break;

		case 2:System.out.println("Speed dialling");break;

		case 3:System.out.println("Call waiting options");break;

		case 4:System.out.println("Own number sending");break;

		case 5:System.out.println("phone line in use");break;

		case 6:System.out.println("Automatic answer");break;
		}

	case 2:System.out.println("phone settings");

	System.out.print("enter a number: ");
	int phoneSet = input.nextInt();

	switch(phoneSet){
	case 1:System.out.println("Language");break;

	case 2:System.out.println("Cell info display");break;

	case 3:System.out.println("welcome note");break;

	case 4:System.out.println("Network selection");break;

	case 5:System.out.println("Lights");break;

	case 6:System.out.println("Confirm SIM service actions");break;
	}

	case 3:System.out.println("Security settings");

		System.out.print("enter a number: ");
		int security = input.nextInt();

		switch(security){
		case 1:System.out.println("Pin code request");break;

		case 2:System.out.println("Call barring service");break;

		case 3:System.out.println("Fixed dialling");break;

		case 4:System.out.println("Closed user group");break;

		case 5:System.out.println("Phone security");break;

		case 6:System.out.println("Change access codes");break;
		}

	case 4:System.out.println("Restore factory settings");break;
	}

	
case 7:System.out.println("Call Divert");break;


case 8:System.out.println("Games");break;


case 9:System.out.println("Calculator") ;break;


case 10:System.out.println("Reminders");break;


case 11:System.out.println("Clock");

		System.out.print("enter a number: ");
		int clock = input.nextInt();

	switch(clock){
	case 1:System.out.println("Alarm clock");break;

	case 2:System.out.println("Clock settings");break;

	case 3:System.out.println("Date setting");break;

	case 4:System.out.println("Stopwatch");break;

	case 5:System.out.println("Countdown timer");break;

	case 6:System.out.println("Auto update of date and time");break;
	}


case 12:System.out.println("Profiles");break;


case 13:System.out.println("SIM Services");break;


}






	

}
}