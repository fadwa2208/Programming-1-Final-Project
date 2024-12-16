/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banking;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author raphaelr
 */
public class Client implements IClient{
    private static int counter = 1; 
    
    private int id;
    private String firstName;
    private String lastName;
     private ArrayList<Account> accountList;

    public Client() {
        this.id = counter;
        counter++;
        this.firstName="";
        this.lastName="";
        this.accountList= new ArrayList<Account>();
    }

    public Client( String firstName, String lastName) {
        this.id = counter;
        counter++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountList = new ArrayList<Account>();
    }

    

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "The client's full name is " + this.firstName + " " + this.lastName + ". Your ID is " + this.id+".";
    }

    @Override
    public void addAccount(Account newAccount) {
          if (newAccount != null) {
            newAccount.setOwner(this);
            this.accountList.add(newAccount);
            System.out.println(newAccount);
        }
    }

    @Override
    public void displayAccounts() {
       if(accountList.isEmpty()){
           System.out.println("There are no accounts in this bank");
       }
       else{
           System.out.println("Here are all accounts in this bank:");
           for (int i = 0; i < accountList.size(); i++) {
               System.out.println(accountList.get(i));
           }
       }
    }

    @Override
    public Account getAccount(int accountNumber) {
        Account account=null;
        if(accountList.isEmpty()){
           System.out.println("There are no accounts for this client");
        }
       else{
           for (int i = 0; i < accountList.size(); i++) {
               if(accountNumber==accountList.get(i).getAccountNumber()){
                account=accountList.get(i);
               }
           }
        }
        if(account==null){
            System.out.println("There isn't an account with this number for this client");
        }
        return account;
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
        final Client other = (Client) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.firstName, other.firstName)) {
            return false;
        }
        return Objects.equals(this.lastName, other.lastName);
    }

    

    
 
    

}
