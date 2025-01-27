package DietelChapterFourExercise;

import java.util.Scanner;

public class ExerciseFourpointOneEightCreditLimitCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            System.out.println("Enter account Number:");
            int accountNumber = sc.nextInt();
            System.out.println("Enter beginning balance:");
            int beginningBalance = sc.nextInt();
            System.out.println("Enter total charges:");
            int totalCharges = sc.nextInt();
            System.out.println("Enter credits applied:");
            int credit = sc.nextInt();
            System.out.println("Enter credit limit:");
            int creditLimit = sc.nextInt();

            double newBalance = beginningBalance + totalCharges - credit;
            System.out.println("New balance: " + newBalance);
            if (newBalance > creditLimit) {
                System.out.println("You have credit limit exceeded");
            }
        }
    }

