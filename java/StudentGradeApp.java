import java.util.Arrays;
import java.util.Scanner;
public class studentGradeApp{

	public static void main(String... args){

	Scanner scanner = new Scanner(System.in);

	System.out.println("Enter the number of Students: ");
	int numberOfStudents = scanner.nextInt();
	//System.out.print(numberOfStudent);

	System.out.println("How many subjects do they offer: ");
	int numberOfSubjects = scanner.nextInt();
	//System.out.print(numberOfSubjects);

String saving = """

	Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

	Saved successfully

	""";
	System.out.print(saving);

System.out.println("=====================================================");


String [] subjects = {"STUDENT" + "   "  +  "SUB1"  + "    " +  "    "+"SUB2" + "     "+ "SUB3" +  "    " +  "TOT" +"      " + "POS"};
System.out.println(Arrays.toString(subjects));

System.out.println("======================================================");



for(int row =0;row < numberOfStudents;row ++){

	String [] students = numberOfStudents [row ];

	for(int colomn = 0;colomn < numberOfSubjects;colomn ++){
	int subject = row;
	
	System.out.println(students );
}
}



}




}