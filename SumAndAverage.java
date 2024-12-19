
import java.util.Scanner;
public class SumAndAverage{

	public static void main(String... args){
	Scanner sc = new Scanner(System.in);

	double count = 1;
	double sum =0;
	double average = 0;

	while(count <=10){
	System.out.print("enter a score: ");
	double score = sc.nextDouble();
	sum +=score;
	average = sum/10;
	count+=1;
	}
	System.out.println(sum);
	System.out.println(average);



}
}