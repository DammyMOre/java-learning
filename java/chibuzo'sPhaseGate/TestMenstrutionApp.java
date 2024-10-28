import java.util.Scanner;
import java.time.LocalDate;

public class TestMenstrutionApp{

public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);
	MenstruationApp menstrualApp = new MenstruationApp();

	try{

		System.out.println("Enter your last flow startDate (YY-MM-DD): ");
		String startDate = scanner.nextLine();


		LocalDate localDate = LocalDate.parse(startDate);

		menstrualApp.lastStartDate(localDate);
		menstrualApp.getStartDate();

		//System.out.print(menstrualApp.getStartDate());;
		
		}

	catch(Exception e){
		System.out.println("invalid input");	

	}


	try{

	System.out.print("Enter your menstrualCircleLength: ");
	int menstrualCircleLength = scanner.nextInt();

	menstrualApp.calculateMenstrualCircleLength(menstrualCircleLength);
	menstrualApp.getMenstrualCircleLength();

	//System.out.println(menstrualApp.getMenstrualCircleLength());
	}

	catch(Exception e){
		System.out.print("invalid input");	

	}


	menstrualApp.calculateOvulationPeriod();
	menstrualApp.getOvulationPeriod();

	System.out.println("Your ovulation period is day " + menstrualApp.getOvulationPeriod());

	try{
	System.out.print("Enter your Flow Range: ");
	int flowRange = scanner.nextInt();

	menstrualApp.setflowDate(flowRange);
	menstrualApp.getFlowDate();

	System.out.println("Your Flow days are:  " + menstrualApp.getStartDate() + " - "  + menstrualApp.getFlowDate());
	}

	catch(Exception e){
		System.out.print("invalid input");	

	}


	menstrualApp.setSafePeriod();
	menstrualApp.getSafePeriod();

System.out.println("Your Safe days are:  "  + menstrualApp.getFlowDate() + "-" + menstrualApp.getSafePeriod());



	/*
	menstrualApp.getFertileWindow();
	menstrualApp.setFertileWindow(ovulationPeriod);
	

//System.out.println(menstrualApp.getFertileWindow());


**/





}


}