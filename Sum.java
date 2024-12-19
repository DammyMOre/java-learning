import java.util.Scanner;
public class Sum{

	public static void main(String... args){
	Scanner sc = new Scanner(System.in);

	double count = 1;
	double sum = 0;

	while(count <=10){
	System.out.print("enter a score: ");
	double score = sc.nextInt();
	sum +=score;
	count+=1;
	}
	System.out.print(sum);

}
}