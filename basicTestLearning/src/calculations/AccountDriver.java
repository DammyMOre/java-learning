package calculations;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.exit;

public class AccountDriver {
    static Scanner sc = new Scanner(System.in);
    private static int count = 0;
    private static ArrayList<Account> accounts = new ArrayList<>();
    private  Account account;

public static void menu(){
    System.out.println("""
            ::::::::::::::::::::::::::::::::::::::
            Welcome to MO'RE Banking System 
            ***************************************
            
            1 -> Create new account
            2 -> Get Account
            3 -> deposit
            4 -> Withdraw
            5 -> exit
            
            """);

    String input = sc.nextLine();
    switch (input){
        case "1" -> createAccount();
        case "2" -> getAccounts();
        case "3" -> deposit();
        case "4" -> withdraw();
        case "5" -> exit(0);
    }

}


    public static void getAccounts() {
     System.out.println(accounts);
        menu();

    }

    public static void createAccount() {
        System.out.print("Enter account name: ");
        String name = sc.nextLine();

        System.out.print("Enter address: ");
        String address = sc.nextLine();

        System.out.print("Enter your pin: ");
        String pin = sc.nextLine();

        String accountNumber = accountNumberGenerator();
        Account account = new Account(accountNumber,name,pin,address);
        accounts.add(account);

        System.out.println(account);

        menu();

    }

    private static String accountNumberGenerator(){
        count +=1;
        return "222333444" + count;
    }

    public static Account findAccountNumber(String accountNumber) {
    for (Account account : accounts) {
        if (account.getAccountNumber().equals(accountNumber)) {
            return account;
            }
        }
    throw new RuntimeException("Account not found");
    }
    public static void withdraw() {
        System.out.println("Enter Account Number: ");
        String accountNumber = sc.next();
        Account account = findAccountNumber(accountNumber);
        System.out.println("Enter your Withdrawal amount: ");
        double amount = sc.nextDouble();
        account.withdraw(amount);
        System.out.println("withdrawal Amount of : " + amount + "is successfull");

        menu();
    }
    public static void deposit() {

            System.out.println("Enter Account Number: ");
            String accountNumber = sc.nextLine();
            Account account = findAccountNumber(accountNumber);
            System.out.println("Enter your Deposit amount: ");
            double amount = sc.nextDouble();
            account.deposit(amount);
            System.out.println("Deposit Amount of : " + amount + "is successfull");
            menu();
    }


    public static void main(String[] args) {
       menu();
    }
}