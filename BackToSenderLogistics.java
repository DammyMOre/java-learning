import java.util.Scanner;

public class BackToSenderLogistics{
public static void main(String... args){

Scanner scanner = new Scanner(System.in);
System.out.print("Successful delivery ");
int successfulDelivery = scanner.nextInt();
System.out.print(deliveryOne(successfulDelivery));

}
public static double deliveryOne(int successfulDelivery){
 double ridersPayment = 0;

if (successfulDelivery < 50){	
ridersPayment= (successfulDelivery * 160) + 5000;  
}

else if (successfulDelivery>=50 && successfulDelivery <=59){	
ridersPayment = (successfulDelivery * 200) + 5000;  

}

else if (successfulDelivery>=60 && successfulDelivery <=69){	
ridersPayment = (successfulDelivery * 250) + 5000;  

}

else if (successfulDelivery>=70){	
ridersPayment= (successfulDelivery * 500) + 5000;
}
return ridersPayment;

}

}




