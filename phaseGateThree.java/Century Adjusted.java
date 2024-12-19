

public class Century{

	public static void main(String... args){

	int input = (2005);
	System.out.print(getCentury(input));

}
		

public static  int getCentury(int input){
int century =0;
int year = 0;	
	for(int count = 0; count>year; count ++){
	if(year>=1 && year <=100)
		century+=1;

	for(int counter = 0; counter>count; counter ++){
		year+=100;
		
	}
	}
	return century;
}


}







/*while count!=0{

	
	if(year >=1 && year >= 100);
	century += 1;
	count++;
**/