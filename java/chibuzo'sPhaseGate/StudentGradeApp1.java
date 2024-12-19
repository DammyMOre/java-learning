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


String[] subjectName = new String [numberOfSubjects];
for(int count = 0; count < numberOfSubjects; count++){
	System.out.print("Enter subject name: ");
	subjectName[count] = scanner.next(); 
	}


System.out.println("============================================================================");
System.out.print("STUDENT");

for(int counter =0; counter< subjectName.length; counter++){
System.out.printf("%15s", subjectName[counter]);	
}

System.out.print("     TOTAL     AVERAGE      POSITION");
System.out.println("   ");

System.out.println("=======================================================================");

int [][] result = new int [numberOfStudents][numberOfSubjects];

for(int colomn = 0; colomn < numberOfStudents; colomn ++){
	System.out.println("Enter student name: ");
	String studentName[colomn] = scanner.next(); 
	//String student = studentName;	

	for(int row = 0; row < numberOfSubjects; row ++){
	System.out.println("Enter student score: ");
	int studentScore[row] = scanner.nextInt(); 
	}

}

for(int colomn = 0; colomn < result.length; colomn++){
	
	for(int row =0; row < result[colomn].length; row++){
	
	System.out.print(result[colomn][row]);
	
}
System.out.println(" ");

}
	




	//int subject = [row];
	
	//System.out.println(Arrays.toString(students));



}


}