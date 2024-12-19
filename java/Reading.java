import java.util.Scanner;
public class Reading{

	public static void main(String[] args){
	Scanner scanner= new Scanner(System.in);
	
        int count = 0;

        while(count < 10){

	System.out.println("enter a grade");
        int studentGrade = scanner.nextInt();

	if(studentGrade >= 60)
	System.out.println("pass");
	
	else
	System.out.println("failed");

             count = count + 1;
  
	}

    
}

}

