package DietelChapterFourExercise;
import java.util.Scanner;

public class ExerciseFourPointOneSeven {
   // public class GasMileage{
            public static void main(String[] args){
                Scanner scanner = new Scanner(System.in);
                int totalMiles = 0;
                int totalGallons = 0;
                int miles;
                int gallons;
                while(true) {
                    System.out.print("enter number of miles: ");
                     miles = scanner.nextInt();
                    System.out.print("enter number of gallons: ");
                    gallons = scanner.nextInt();
                    int milesPerGallon = miles / gallons;
                    totalMiles += miles;
                    totalGallons += gallons;
                    System.out.println(milesPerGallon + " miles per gallon");
                    System.out.println("Do you want to continue another trip? [yes/no]");
                    String answer = scanner.next();
                    if (answer.equals("yes")) {
                        continue;
                    } else if (answer.equals("no")) {
                        break;
                    }
                }
                        System.out.println("Total miles: " + totalMiles);
                        System.out.println("Total gallons: " + totalGallons);
          }
            
    }

