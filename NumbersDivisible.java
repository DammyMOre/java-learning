public class NumbersDivisible{

	public static void main(String... args){

	for(int count=100; count<= 200 ; count++){
	
	if (count % 3 == 0 || count%4==0) count++;

	System.out.println(count + " ");

	if (count %10==0) System.out.println();


}


}
}
