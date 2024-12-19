
import java.util.Scanner;
public class ClassAverage{

	public static void main(String... args){
	Scanner sc = new Scanner(System.in);
	
	int total=0;
	int gradecounter=1;
	
	while(gradecounter <=10){

	System.out.print("enter a grade");
	int grade = sc.nextInt();
	total= total+grade;
	gradecounter = gradecounter + 1;	
	}

	int average = total/10;
	System.out.printf("Total of all grades is %d%n", total);
	System.out.printf("Class average is %d%n", average);
	








}
}