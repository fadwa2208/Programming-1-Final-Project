/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banking;

/**
 *
 * @author raphaelr
 */
public class SavingsAccount  extends Account{
    public SavingsAccount(){
        super();
    }

    @Override
    public String toString() {
        return super.toString()+". The saving account number is: "+this.accountNumber+", this account has a balance of "+this.balance+"$";
    }
    
}
