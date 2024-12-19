
public class Century{

	public static void main(String... args){

	int input = 2000;

	System.out.print(getCentury(input));
}
		

public static  String getCentury(int year){
String century = " ";

if(year > 1 && year <= 2100){
	if(year >=1 && year <=100) 

		century = "1st century";

	if(year >=101 && year <=200)

		century ="2nd century";
 
	if(year >=201 && year <=300)

		century ="3rd century";

 
	if(year >=301 && year <=400) 

		century ="4th century";
 
	if(year >=401 && year <=500)

 		century ="5th century";
 
	if(year >=501 && year <=600) 

		century = "6th century";

	if(year >=601 && year <=700)

 		century ="7th century";
 
	if(year >=701 && year <=800)

 		century ="8th century";
 
	if(year >=801 && year <=900) 

		century ="9th century";
 
	if(year >=901 && year <=1000) 

		century ="10th century";
 
	if(year >=1001 && year <=1100)

 		century ="11th century";
 
	if(year >=1101 && year <=1200) 

		century ="12th century";
 
	if(year >=1201 && year <=1300) 

		century ="13th century";
 
	if(year >=1301 && year <=1400) 

		century ="14th century";
 
	if(year >=1401 && year <=1500) 

		century ="15th century";
 
	if(year >=1501 && year <=1600) 

		century ="16th century";
 
	if(year >=1601 && year <=1700) 

		century ="17th century";
 
	if(year >=1701 && year <=1800)

		century ="18th century";
 
	if(year >=1801 && year <=1900)
	
		century ="19th century";
 
	if(year >=1901 && year <=2000)

		century ="20th century";
 
	if(year >=2001 && year <=2100) 
	
		century ="21st century";

	if(year <= 0 && year > 2100)

		century ="enter a valid year";

}

else{
	System.out.print("Invalid Number");
	}
 return century;



}


}