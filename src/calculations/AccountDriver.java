package calculations;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.exit;

public class AccountDriver {
    static Scanner sc = new Scanner(System.in);
    private static int count = 0;
    private static ArrayList<Account> accounts = new ArrayList<>();


public static String menu(){
    System.out.println("""
            ::::::::::::::::::::::::::::::::::::::
            Welcome to C22 Banking System 
            ***************************************
            
            1 -> Create new account
            2 -> Show all accounts
            3 -> exit
            4 -> Delete account
            5 -> deposit
            6 -> Withdraw
            
            """);

    String input = sc.nextLine();
    switch (input){
        case "1" -> createAccount();
        case "2" -> getAccounts();
        case "3" -> exit(1);



    }

  return "Thank you";
}
 public static String getAccounts() {
     System.out.println(accounts);
     return menu();

 }

    public static String createAccount() {
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

        return menu();



    }

    private static String accountNumberGenerator(){
        count +=1;
        return "222333444"+ count;
    }

    public static void main(String[] args) {
        menu();
    }
}