import java.util.Arrays;
public class ArrayInput2{

	public static void main(String... args){
	int[] number = {1,2,3,4,5};
	System.out.print(Arrays.toString(multipleChecker(number)));
	}


public static boolean checker(int number){
	if(number % 2 ==0)return false;
return true;
}

public static boolean[] multipleChecker(int[] input){
boolean [] value = new boolean[input.length];
for(int count =0; count<input.length; count++){
	value[count] = checker(input[count]);

}
return value;

}

}







public class ArrayInput{

	public static void main(String... args){
	System.out.print(checker(2));
	}


public static boolean checker(int number){
	if(number % 2 ==0)return false;
return true;
}


}