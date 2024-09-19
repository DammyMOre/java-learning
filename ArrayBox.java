public class ArrayBox{
	public static void main(String[] args){

	char [][] boxChar = {{'x','o','x'},{'o','o','o'},{'x','o','x'}};

	for(char count =0 ; count<boxChar.length; count++){
		for(char counter = 0; counter < boxChar.length; counter++){
			System.out.print(" " + boxChar[count ] [counter ]);
		}
			System.out.println();
}	
}
}
	