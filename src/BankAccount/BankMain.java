package BankAccount;

import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Menu = """
                1. Open Account
                2. Deposit
                3. Withdraw
                4. Transfer
                5. Check Balance
                6. Exit
                """;
        System.out.println(Menu);
        System.out.println("what will you like to do?");
        int choice = sc.nextInt();
        switch (Menu) {
            case "1": openAccount();
            case "2": deposit();
            case "3": withdraw();
            case "4": transfer();
            case "5": checkBalance();
            case "6": exit();
        }



    }
    private static void openAccount() {

    }
    private static void deposit() {
    }
    private static void withdraw() {
    }
    private static void transfer() {
    }
    private static void checkBalance() {

    }

    private static void exit() {
    }











}
