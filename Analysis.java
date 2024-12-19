import java.util.Scanner;
public class Analysis{
	public static void main(String... args){
	Scanner sc = new Scanner(System.in);
	int pass = 0;
	int fail = 0;
	int count = 1;
	while (count <= 10){
	System.out.print("enter result(enter 1 for pass and 2 for fail: )");
	int result = sc.nextInt();
	
	if(result ==1){
	pass+=1;
	}
	else
	fail+=1;
	count +=1;
	}
	System.out.printf("pass is: %d%nFail is: %d%n", pass, fail);
	if(pass>=8)System.out.print("Bonus to instructor");
	


}
}