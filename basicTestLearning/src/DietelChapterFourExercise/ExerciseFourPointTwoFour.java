package DietelChapterFourExercise;

import java.util.Scanner;
//exercise 4.24 (validating user input)

public class ExerciseFourPointTwoFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a number: ");
            int num = sc.nextInt();
            if (num>=1 && num<=2){
                System.out.println("weldone!!");
                break;
            }
            else {
                System.out.println("Invalid number!");
                continue;
            }

        }
    }
}
