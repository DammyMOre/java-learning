public class KataPrac{

public static void main(String...args){
int number = -1;
int value = 9;
System.out.print(subtract(number,value));

}
int result;
public static int subtract(int number, int value){
	
	int result = number - value;
	if(result<0 && value<0 && number < 0){
	result =- result;
	value =- value;
	number =- number;
		
	}	
	return result;

	}



}