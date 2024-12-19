import java.util.Arrays;
public class MinimumAndMaximum{
	public static void main(String... args){
	int [] numbers = {1,2,3,4,5};

	System.out.print(Arrays.toString(minimumMaximum(numbers)));
	}

public static int[] minimumMaximum(int [] data) {

 	int minimum = data[0];
	int maximum = data[0];

	for(int count=0; count<data.length; count++){

	if(data[count]< minimum) minimum = data[count];
	if(data[count]> maximum) maximum = data[count];

	}

	int[] finalResult = {minimum, maximum};

	return finalResult;
	
}


}