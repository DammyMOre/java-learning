public class FunctionPracticeNokia{
	public static void main(String... args){




}

public static void nokiaMenu(){

String Menu ="""
	PHONE MENU
	1. Phone Book
	2. Messages
	3. Chat
	4. Call register
	5. Tones
	6. Settings
	7. Call Divert
	8. Games
	9. Reminders
	10. Clock
	11. Profiles
	12. Sim Services
	
	""";
	System.out.print(Menu);
	Scanner sc = new Scanner(System.in);
	System.out.print("enter a number");
	int enter = sc.nextInt();

	switch(enter){
	case 1: phoneBook();break;


	}
}	
public static void phoneBook(){
	
	String phoneBookMenu = """
		1. search
		2. service no
		3. Add name
		4. Erase
		5. edit
		6. Assign Tone
		7. Send B' card
		8. Options 
		9. Speed dials 
		10. voice tags
		11. go back to main menu
		""";
	System.out.print(phoneBookMenu);
	Scanner sc = new Scanner(System.in);
	System.out.print("enter a number");
	int phone = sc.nextInt();

		switch(phone){
		case 1: System.out.print("search"); break;
		case 2: System.out.print("service no"); break;
		case 3: System.out.print("Add name"); break;
		case 4: System.out.print("erase"); break;
		case 5: System.out.print("edit"); break;
		case 6: System.out.print("Assign tone"); break;
		case 7: System.out.print("Send B' card"); break;
		case 8: options(); break;
		case 9: System.out.print("Speed dials"); break;
		case 10: System.out.print("voice tags"); break;
		case 11: System.out.print("go back to main menu"); break;



	}
	

}





}

