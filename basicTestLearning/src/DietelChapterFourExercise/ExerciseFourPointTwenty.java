package DietelChapterFourExercise;

import java.util.Scanner;

public class ExerciseFourPointTwenty {
        public static void main(String... args){
            Scanner sc = new Scanner(System.in);
            double taxRateForEarningsBelowThirtyThousand = 0.15;
            double taxRateForEarningsAboveThirtyThousand = 0.20;
            double tax;
            for(int count = 1; count<=3; count++){
                System.out.println("Enter your name: ");
                String name = sc.nextLine();

                System.out.println("Enter earnings: ");
                int earnings = sc.nextInt();
                sc.nextLine();

                if(earnings <= 30000){
                    tax = taxRateForEarningsBelowThirtyThousand * earnings;
                    System.out.println("Your tax is: #" + tax);
                }

                else if(earnings >= 30000){
                    tax = taxRateForEarningsAboveThirtyThousand * earnings;
                    System.out.println("Your tax is: #" + tax);

                }

            }


        }
    }
