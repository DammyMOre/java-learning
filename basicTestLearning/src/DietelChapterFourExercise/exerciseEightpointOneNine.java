package DietelChapterFourExercise;

import java.util.Scanner;

public class exerciseEightpointOneNine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        int value = 0;
        int items =0;
        while (value!=-1) {
            System.out.println("Enter the value: ");
            value = sc.nextInt();

            if (value!=-1) {
                items++;
                total += value;
            }
        }
        double ninePercentOfGrossSales = 0.09 * total;
        double totalPay = (200 + ninePercentOfGrossSales);
        System.out.println("items sold: " + items);
        System.out.println("Total value of items sold is " + total);
        System.out.println("Your total pay is $" + totalPay);

    }
}
