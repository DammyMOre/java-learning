
public class NumbersDivisibleByThreeAndFour{

	public static void main(String... args){

	int numbers = 1000;

	for(int count=100; count<= 1000 ; count++){
	
		if (count % 3 == 0 && count%4==0) count++;

		System.out.println(count + " ");

		if (count %11==0)System.out.println();
		
	}
		


}
}



