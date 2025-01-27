package calculations;

import java.util.Scanner;

public class LetterGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        int gradeCount = 0;
        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        int dCount = 0;
        int eCount = 0;
        int fCount = 0;
        System.out.println("Enter the grade of the student: ");

        while (sc.hasNextInt() ) {
            int grade = sc.nextInt();
            total += grade;
            gradeCount++;
            switch (grade / 10) {
                case 10:
                case 9:
                    aCount++;
                    break;
                case 8:
                    bCount++;
                    break;
                case 7:
                    cCount++;
                    break;
                case 6:
                    dCount++;
                    break;
                case 5:
                    eCount++;
                    break;
                default:
                    fCount++;
                    break;
            }

        }
        System.out.println("Total grades: " + total);
        System.out.println("Total students: " + gradeCount);
        System.out.println("Total number of students who had an A is: " + aCount);
        System.out.println("Total number of students who had a B is: " + bCount);
        System.out.println("Total number of students who had a C is: " + cCount);
        System.out.println("Total number of students who had a D is : " + dCount);
        System.out.println("Total number of students who had a E is: " + eCount);
        System.out.println("Total number of students who had an F is: " + fCount);

    }
}
