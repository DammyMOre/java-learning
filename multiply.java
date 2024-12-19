public class Multiply{

public static void main(String...args){
int number = -2;
int figure = -3;

System.out.print(getProduct(number,figure));

}

public static int getProduct(int number, int figure){
	int product =0;
	if(number<0 && figure<0){
	number =- number;
	figure =- figure;
	}
	for(int counter=0;counter<figure;counter++){
			
		product += number;
	
	}

	return product;
}

}