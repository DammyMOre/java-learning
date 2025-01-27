package calculations;

import java.util.Scanner;

public class MaximumFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a double number: ");
        double number1 = sc.nextDouble();
        double number2 = sc.nextDouble();
        double number3 = sc.nextDouble();
        double result = maximum(number1,number2,number3);
        System.out.println("Maximum is: " + result);


    }

    public static double maximum(double number1, double number2, double number3) {
        double max = number1;
        if (number2 > max) {
            max = number2;
        }
        if (number3 > max) {
            max = number3;
        }
        return max;
    }

}
