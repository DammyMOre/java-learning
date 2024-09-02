import java.util.Scanner;

public class BackToSenderLogistics{
public static void main(String... args){

Scanner scanner = new Scanner(System.in);
System.out.print("Successful delivery ");
int successfulDelivery = scanner.nextInt();
return deliveryOne;

}

public static double deliveryOne(int successfulDelivery){
 
if (successfulDelivery < 50){	
int amount = (successfulDelivery * 160) + 5000;  
int ridersPayment = amount;
return amount;
}
else if (successfulDelivery>=50 && successfulDelivery <=59){	
int amount = (successfulDelivery * 200) + 5000;  
int ridersPayment = amount;
return amount;
}


else if (successfulDelivery>=60 && successfulDelivery <=69){	
int amount = (successfulDelivery * 250) + 5000;  
int ridersPayment = amount;
return amount;
}

else if (successfulDelivery>=70){	
int amount = (successfulDelivery * 500) + 5000;
int ridersPayment = amount;
return amount;
}

}
}




