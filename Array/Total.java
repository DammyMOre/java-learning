/*
pseudo code
create a array
loop through the array 
add them together

**/




public class Total{

public static void main(String...args){

int [] number = {1,2,3,4,5};
	
System.out.print(runningTotal(number));

}

int total =0;
int add=0;
int counter = 0;
public static int [] runningTotal(int[] input){


for(int count=0;count<input.length; count++){
	int total = input[count];

	for(int counter = 0; counter<count; counter ++){
		 int add += counter;

	}
return add;
}






}



}