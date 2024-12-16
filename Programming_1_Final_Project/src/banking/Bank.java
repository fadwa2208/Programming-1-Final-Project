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
public class Bank implements IBank{
    private String address;
    private String bankNumber;
    private ArrayList<Client> clientList;
    
    public Bank(){
        this.bankNumber = "";
        this.address = "";
        this.clientList= new ArrayList<Client>();
         
    }

    public Bank(String address, String bankNumber) {
        this.address = address;
        this.bankNumber = bankNumber;
        this.clientList = clientList;
        this.clientList= new ArrayList<Client>();
    }
    
    
    
    public String getBankNumber(){
        return this.bankNumber;
    }
    
    public String getAddress(){
        return this.address;
    }
    
    public void setBankNumber(String bankNumber){
        this.bankNumber = bankNumber;
    }
    
    public void setAddress(String address){
        this.address = address;
    }

    @Override
    public String toString() {
        return "The address of this bank is "+ this.address + ". Your bank number is "+ this.bankNumber+".";
    }

    @Override
    public void addClient(Client c) {
        
        //c = UserInputManager.retrieveClientInfo();
        clientList.add(c);
        
    }
    

    @Override
    public void displayClientAccounts(int clientId) {
        Client c = this.getClient(clientId);
            if(c != null){
                c.displayAccounts();
            }
    }

    @Override
    public void displayClientList() {
        if(clientList.isEmpty()){
           System.out.println("There are no clients in this bank");
       }
       else{
           System.out.println("Here are all clients in this bank:");
           for (int i = 0; i < clientList.size(); i++) {
               System.out.println(clientList.get(i));
           }
       }
    }

    @Override
    public Client getClient(int id) {
         Client client=null;
        
           for (int i = 0; i < clientList.size(); i++) {
               if(id==clientList.get(i).getId()){
                client=clientList.get(i);
               }
               return client;
        }
        System.out.println("There is no client with the provided ID");
        return null;
    }

    @Override
    public Account getClientAccount(int clientId, int accountNumber) {
         Account acc = null;
        Client c = this.getClient(clientId);
            if(c != null){
                acc = c.getAccount(accountNumber);
            }
        return acc;
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
        final Bank other = (Bank) obj;
        if (!Objects.equals(this.address, other.address)) {
            return false;
        }
        return Objects.equals(this.bankNumber, other.bankNumber);
    }
    
    
}
