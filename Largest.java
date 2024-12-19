public class Largest{
	
	
public static int largestElement(int [] numbers){
	
	int [] element = new int [numbers];

	int largest = numbers[0];

	for(int count=0; count<numbers.length; count++){
	if(numbers[count]> largest) largest= numbers[count];

	}

	return largest;
}
public static void main(String... args){
	
int[] userInput ={2,4,6,8,9,12};
System.out.println("The largest number is: "+ largestElement(userInput));	
}

}