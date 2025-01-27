package bankingapplication;

import bankingapplication.exceptions.InvalidDepositException;
import bankingapplication.exceptions.InvalidWithdrawalException;

import javax.security.auth.login.AccountNotFoundException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

    public class BankMain {
        static Scanner x = new Scanner(System.in);

        public static void main(String[] args) {
            menu();
        }

        public static String input(String message){
            System.out.print(message);
            return x.nextLine();
        }

        public static void menu(){
            LocalDateTime today = LocalDateTime.now();
            System.out.println("""
            ::::::::::::::::::::::::::::::::::::::::::
                Welcome to Dami's  Bank:
                Date : """+ today + """
            
            ::::::::::::::::::::::::::::::::::::::::::  
                1 create account    2. deposit
                3. withdraw         4. transfer money
                5. Check balance    6. transaction history
                7. update account   8. forget pin
                9. other services   10. exist
                   """);
            String option = input("Enter your choice: ");
            switch (option){
                case "1": createAccount(); break;
                case "2": deposit(); break;
                case "3": withdraw(); break;
                case "4" : transfer(); break;
                case "5": checkBalance(); break;
                default:
                    System.out.println("Invalid option");
                    menu();
            }
        }

        private static void checkBalance() {
            try {
                String accountNumber = input("Enter account number: ");
                String balance = Bank.checkBalance(accountNumber);
                System.out.println(balance);
            } catch (AccountNotFoundException e) {
                System.out.println(e.getMessage());
            }
            menu();
        }

        private static void transfer() {
            try {
                String number = input("Enter your Account number: ");
                String recieversNumber = input("Enter reciever's Account number: ");
                double amount = Double.parseDouble(input("Enter the amount to transfer: "));
                String pin = input("Enter your pin: ");
                String message = Bank.transfer(number,recieversNumber,amount,pin);
                System.out.println(message);
            }catch (AccountNotFoundException e){
                System.out.println(e.getMessage());
            }
            menu();
        }

        public static void createAccount(){
            String name = input("Enter your name: ");
            String pin = input("Enter your pin: ");
           // String confirmPin = Account.getPin();
            String accountNumber = Bank.accountNumberGenerator();
            Account createdAccount = Bank.createAccount(name, accountNumber, pin);
            System.out.println("Account created successfully Details: \n" + createdAccount);
            menu();
        }
        public static void deposit(){
            try{
                String number = input("Enter your Account number: ");
                double amount = Double.parseDouble(input("Enter your amount to deposit: "));
                String message = Bank.deposit(number,amount);
                System.out.println(message);
            }catch(AccountNotFoundException | InvalidDepositException error){
                System.out.println(error.getMessage());
            }
            menu();
        }
        public static void withdraw(){

            try {
                String number = input("Enter your Account number: ");
                double amount = Double.parseDouble(input("Enter your amount to withdraw: "));
                String pin = input("Enter your pin: ");
                String message = Bank.withdrawal(number,amount,pin);
                System.out.println(message);
            }catch (AccountNotFoundException e){
                System.out.println(e.getMessage());
            }
            menu();
}




    }

