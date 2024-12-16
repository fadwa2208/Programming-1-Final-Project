/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banking;

import java.util.ArrayList;

/**
 *
 * @author raphaelr
 */
public abstract class Account implements IAccount{
    protected static int counter=1; 

    protected int accountNumber;
    protected double balance;
    protected Client owner;
    protected  ArrayList<Transaction> transactions;

    public Account(){
        this.accountNumber = counter;
        counter = counter+1;
        this.balance = 0.0;
        this.owner = null;
        this.transactions= new ArrayList<Transaction>();
    }

    public Account(int accountNumber, double balance, Client owner) {
        this.accountNumber = counter;
        counter = counter+1;
        this.balance = balance;
        this.owner = owner;
        this.transactions = new ArrayList<Transaction>();
    }
    
    
    

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Account.counter = counter;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Client getOwner() {
        return this.owner;
    }

    public void setOwner(Client owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "The owner of this account is "+ this.owner.getFirstName() + " " + this.owner.getLastName();
    }

    @Override
    public double deposit(double d) {
        if(d>0.00 && d<Double.MAX_VALUE ){
            this.setBalance(this.getBalance()+d);
            System.out.println("Your new balance is "+this.getBalance()+"$");
            transactions.add(new Transaction("deposit", d));
        }
        else{
            System.out.println("You can't deposit this amount");
        }
        return this.getBalance();
    }

    @Override
    public void displayAllTransactions() {
        if(transactions.isEmpty()){
           System.out.println("There are no transactions made in this bank");
       }
       else{
           System.out.println("Here are all the transactions made in this bank:");
           for (int i = 0; i < transactions.size(); i++) {
               System.out.println(transactions.get(i));
           }
       }
    }

    @Override
    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    @Override
    public double withdrawal(double w) {
        if(this.getBalance() - w > 0 && w > 0.00 && w <= Double.MAX_VALUE){
            this.setBalance(this.getBalance() - w);
            System.out.println("Your new balance is: $" +this.getBalance());
            transactions.add(new Transaction("withdrawal", w));
        }else{
            System.out.println("You can't withdraw that amount");
        }
        
        return this.getBalance();
    }

   
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Account other = (Account) obj;
        return this.accountNumber == other.accountNumber;
    }
    
    
    
    
    
}
