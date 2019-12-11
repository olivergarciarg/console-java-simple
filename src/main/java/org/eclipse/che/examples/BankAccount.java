package org.eclipse.che.examples;

public class BankAccount {

    private int accountNumber;
    private double balance=0;
    private String customerName;
    private String email;
    private String phoneNumber;

    public void deposit(double amount){
        this.balance += (amount>=0)? amount : 0;
        System.out.println("new balance is " + this.balance);
    }

    public void withdraw(double amount){
        if (amount < 0) {
            System.out.println("can't withdraw negative amounts");
        }else if(amount>balance){
            System.out.println("insufficient funds, your balance is" + this.balance);
        }else{
            this.balance -= amount;
            System.out.println("new balance is " + this.balance);
        }
    }
}