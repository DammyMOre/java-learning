import java.util.Scanner;
public class TelevisionTest{
	public static void main(String... args){
	Scanner scanner = new Scanner(System.in);

	Television television = new Television();

	System.out.print("Enter volume: ");
	int volume = scanner.nextInt();

for(int count =0; count < volume; count++){
	television.increaseVolume();

	}

television.decreaseVolume();
television.decreaseVolume();
television.decreaseVolume();


	
int response = television.getVolume();

System.out.print("volume is: " + response);

}
}