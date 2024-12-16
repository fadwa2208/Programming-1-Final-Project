/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banking;

import java.util.Scanner;

/**
 *
 * @author raphaelr
 */
public class UserInputManager {

    public static int retrieveAccountNumber() {
       Scanner sc = new Scanner(System.in);
       System.out.println("Please enter your account number:");  
       int accountNumber = sc.nextInt();
       return accountNumber;
    }

    public static Account retrieveAccountType() {
        Scanner sc = new Scanner(System.in);
        int accountType;
        Account account = null;
        
        do {
            System.out.println("Select the account type:");
            System.out.println("[1] Checking Account  [2] Savings Account ");
            accountType = sc.nextInt();

            if(accountType == 1) {
                account = new CheckingAccount();
                System.out.println("Checking Account successfully created");
            }else if(accountType == 2) {
                account = new SavingsAccount();
                System.out.println("Savings Account successfully created");
            } else {
                System.out.println("Invalid option. Please Choose A Valid Option.");
            }
        }while(account == null);
        return account;
    }

    public static int retrieveClientId() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your ID number: ");
        int ID= sc.nextInt();
        return ID;
    }

    public static Client retrieveClientInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("please enter your first name: ");
        String firstName= sc.next();
        System.out.print("please enter your last name: ");
        String lastName= sc.next();
        
        Client client  = new Client(firstName, lastName);
        return client;
    }

    public static double retrieveTransactionAmount() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the desired transaction amount:");
        return sc.nextDouble();
    }

    public static int retrieveUserOption() {
        System.out.printf("%-38s\n","Please select one of the following options");
        System.out.printf("%-38s","[1] Add a new Client");
        System.out.printf("%-38s\n","[2] Create a new Account for a Client");
        System.out.printf("%-38s","[3] Make a Deposit");
        System.out.printf("%-38s\n","[4] Make a Withdrawal");
        System.out.printf("%-38s","[5] List All Clients");
        System.out.printf("%-38s\n","[6] List all Client Accounts");
        System.out.printf("%-38s","[7] List all Account Transactions");
        System.out.printf("%-38s\n","[0] Exit");
        
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        
        return option;
    }
    
}