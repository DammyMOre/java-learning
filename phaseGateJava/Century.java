import java.util.Scanner;

public class Century{

	public static void main(String... args){


	int input = (2005);
}
		

public static  int getCentury(int year){
int century = 0;

String Century = """
1-100 -1st century
101-200-2nd century 
201-300-3nd century 
301-400-4rd century 
401-500-5th century 
501-600-6th century 
601-700-7th century 
701-800-8th century 
801-900-9th century 
901-1000-10th century 
1001-1100-11th century 
1101-1200-12th century 
1201-1300-13th century 
1301-1400-14th century 
1401-1500-15th century 
1501-1600-16th century
1601-1700-17th century 
1701-1800-18th century 
1801-1900-19th century 
1901-2000-20th century 
2001-2100-21th century

""";

System.out.print(century);

Scanner sc = new Scanner(System.in);
System.out.print("enter a year");
int year = sc.nextInt();

if(year >=1 && year <=100) 

	 century = 1st;

if(year >=101 && year <=200)

 century = 2nd;
 
if(year >=201 && year <=300)

 century = 3rd;

 
/*if(year >=301 && year <=400) System.out.print("4th century");
 
if(year >=401 && year <=500) System.out.print("5th century");
 
if(year >=501 && year <=600) System.out.print("6th century");
 
if(year >=601 && year <=700) System.out.print("7th century");
 
if(year >=701 && year <=800) System.out.print("8th century");
 
if(year >=801 && year <=900) System.out.print("9th century");
 
if(year >=901 && year <=1000) System.out.print("10th century");
 
if(year >=1001 && year <=1100) System.out.print("11th century");
 
if(year >=1101 && year <=1200) System.out.print("12th century");
 
if(year >=1201 && year <=1300) System.out.print("13th century");
 
if(year >=1301 && year <=1400) System.out.print("14th century");
 
if(year >=1401 && year <=1500) System.out.print("15th century");
 
if(year >=1501 && year <=1600) System.out.print("16th century");
 
if(year >=1601 && year <=1700) System.out.print("17th century");
 
if(year >=1701 && year <=1800) System.out.print("18th century");
 
if(year >=1801 && year <=1900) System.out.print("19th century");
 
if(year >=1901 && year <=2000) System.out.print("20th century");
 
if(year >=2001 && year <=2100) System.out.print("21st century");**/
 

}




}