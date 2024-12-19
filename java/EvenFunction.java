import java.util.Scanner;
public class EvenFunction{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a number: ");
int number = scanner.nextInt();
System.out.println(isEven(number));

}

public static boolean isEven(int num){

if(num % 2 == 0){
 return true;
}
else{
return false;

}


}


}


















/**import java.util.Scanner;

public class EvenFunction{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);
System.out.print("Enter a number: ");
int number = scanner.nextInt();
System.out.println(isEven(number));
}


public static boolean isEven(int num){

if (num % 2== 0){
return true;
}
else{
return false;
}



}

}
**/