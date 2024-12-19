public class SquareAsterick{

	public static void asterick(int star){

	for(int count =star; count >0; count--){
		
	     
		for(int pat = star; pat >0; pat--){
			System.out.print("* ");
		}

	System.out.println("");
	     }

		

}






public static void main(String[] args){
  asterick(4);
}


}