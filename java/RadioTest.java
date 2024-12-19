import java.util.Scanner;
public class RadioTest{
	public static void main(String... args){
	Scanner x = new Scanner(System.in);

	Radio jr = new Radio();


System.out.print("Enter your volume : ");
int volume = x.nextInt();


for( int count = 0; count < volume; count++){
jr.increaseVolume();

}
//jr.decreaseVolume();
//jr.decreaseVolume();
jr.setName("Samsung Radio");
jr.turnOn();
jr.turnOff();

int result = jr.getVolume();

System.out.println("Radio name : "+ jr.getName());
System.out.println("\n The Current Volume is : "+ result);
System.out.println("Radio State : "+ jr.getIsOn());


}

}