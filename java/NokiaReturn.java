

import java.util.Scanner;

public class NokiaReturn{
	
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
		
	}

	System.out.print(Menu);
	Scanner input = new Scanner(System.in);
	System.out.print("enter a number: ");
	int enter = input.nextInt();
		
	switch(enter){






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

""";
		
	System.out.print("enter a number: ");
	int message = input.nextInt();

	public static void goToMessages(){

	switch(message){

case 2:System.out.println("Messages");

		case 1:System.out.println("Write a message");break;

		case 2:System.out.println("Inbox");break;

		case 3:System.out.println("Outbox");break;

		case 4:System.out.println("Picture messages");break;

		case 5:System.out.println("Templates");break;

		case 6:System.out.println("Smileys");break;

		case 7:System.out.println("Messsage settings");
			
	case 8:System.out.println("Info service");break;
	case 9:System.out.println("Voice mailbox number");break;
	case 10:System.out.println("Service command editor");break;
	case 0:returnToMenu();break;
}
}   


case 3:System.out.println("Chat");break;


String CallRegister="""

1. Missed calls
2. Received calls
3. Dialled numbers
4. Erase recent call lists
5. Show call duration
	   1. Last call duration
	   2. All calls'duration
	   3.Recieved calls duration
	   4. Dialled calls duration 
	   5. Clear timers
6. Show call costs
	   1.Last call cost
	   2. All calls' cost
	   3. Clear counters
7. Call Cost settings
	   1. Call cost limits
	   2. Show costs in
8. Prepaid credit

""";

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
	case 0: goToMessages();break
	}
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