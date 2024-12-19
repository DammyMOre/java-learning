import java.util.Arrays;
import java.util.Scanner;

public class StudentGradeApp {

    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of Students: ");
        int numberOfStudents = scanner.nextInt();

        System.out.println("How many subjects do they offer: ");
        int numberOfSubjects = scanner.nextInt();

        System.out.println("=====================================================");

        // Create arrays to store student names and their grades
        String[] students = new String[numberOfStudents];
        int[][] grades = new int[numberOfStudents][numberOfSubjects];

        // Input student names
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter the name of student " + (i + 1) + ": ");
            students[i] = scanner.next();
        }

        // Input grades for each student
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter grades for " + students[i] + ":");
            for (int j = 0; j < numberOfSubjects; j++) {
                System.out.print("Subject " + (j + 1) + ": ");
                grades[i][j] = scanner.nextInt();
            }
        }

        System.out.println("=====================================================");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s\n", "STUDENT", "SUB1", "SUB2", "SUB3", "TOT", "POS");

        // Calculate total and position (ranking)
        for (int i = 0; i < numberOfStudents; i++) {
            int total = 0;
            for (int j = 0; j < numberOfSubjects; j++) {
                total += grades[i][j];
            }
            // Print student info and their grades
            System.out.printf("%-10s %-10d %-10d %-10d %-10d\n", students[i], grades[i][0], 
                    (numberOfSubjects > 1 ? grades[i][1] : 0), 
                    (numberOfSubjects > 2 ? grades[i][2] : 0), 
                    total);
        }

        System.out.println("=====================================================");

        scanner.close();
    }
}
