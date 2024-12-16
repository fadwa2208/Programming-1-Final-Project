

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package banking;


/**
 *
 * @author raphaelr
 */
public class Banking {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Bank myBank = new Bank();
        myBank.setBankNumber("0123");
        myBank.setAddress("835 Sainte-Croix");

        Bank myOtherBank = new Bank("3210", "538 Descelles");
        
//        System.out.println("The bank #" + myBank.getBankNumber() + " is located at " + myBank.getAddress());
//        System.out.println("The bank #" + myOtherBank.getBankNumber() + " is located at " + myOtherBank.getAddress());
        
        
        Transaction t = new Transaction("deposit", 50.0);
        Transaction otherT = new Transaction(50.0, "deposit");
        
        int option;
        
        
        do{
        option = UserInputManager.retrieveUserOption();
        System.out.println("You have selected option " + option);
        
    
        if(option == 1){
                Client clients =UserInputManager.retrieveClientInfo();
                myBank.addClient(clients);
                System.out.println(clients);
           

        }
        if(option == 2){
            
            
            int clientId = UserInputManager.retrieveClientId();
            Client c = myBank.getClient(clientId);
            if(c != null){
                c.addAccount(UserInputManager.retrieveAccountType());
            }
        }
            
            if(option==3){
                   Account acc = myBank.getClientAccount(UserInputManager.retrieveClientId(), UserInputManager.retrieveAccountNumber());
            if(acc != null){
                acc.deposit(UserInputManager.retrieveTransactionAmount());
            }
            
        }
              

            if(option==4){
                    Account acc = myBank.getClientAccount(UserInputManager.retrieveClientId(), UserInputManager.retrieveAccountNumber());
            if(acc != null){
                acc.withdrawal(UserInputManager.retrieveTransactionAmount());
            }
            
         }
              
            if(option==5){
                myBank.displayClientList();
            }
               
            if(option==6){
                 int clientID  = UserInputManager.retrieveClientId();
                  Client c=myBank.getClient(clientID);
               if(c!=null){
                   c.displayAccounts();
               }
               
            }
             
            if(option==7){
                 Account acc = myBank.getClientAccount(UserInputManager.retrieveClientId(), UserInputManager.retrieveAccountNumber());
                if(acc != null){
                acc.displayAllTransactions();
              }
            }
           printLine();         
        }while(option!=0);
                
        //java sample code
        
    }
    public static void printLine(){
        System.out.println("--------------------------"); 
    }
}
