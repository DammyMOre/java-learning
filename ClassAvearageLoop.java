import java.util.Scanner;
public class ClassAverageLoop{
	public static void main(String... args){
	Scanner sc = new Scanner(System.in);

	int total=0;
	int count =1;
	while(count<=10){

	System.out.print("enter a grade: ");
	int grade = sc.nextInt();
	total = total+grade;
	count =count+1;
	}
	int average = total/10;
System.out.printf("Total of all grade is: %d%n", total);
System.out.printf("Class average is: %d%n", average);

}

}