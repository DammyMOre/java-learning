package DietelChapterFourExercise;

import java.util.Scanner;

public class ExerciseFourPointTwoThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int largest=0;
        int secondLargest=0;
        for(int count =0; count <= 10; count++) {
            System.out.println("Enter a number: ");
            int num = sc.nextInt();
            if(num>largest) {
                secondLargest = largest;
                largest = num;
            }
            else if(num>secondLargest && num != largest) {
                largest = num;
            }

        }System.out.println("Largest is: " + largest);
        System.out.println("Second Largest is: " + secondLargest);
    }
}
